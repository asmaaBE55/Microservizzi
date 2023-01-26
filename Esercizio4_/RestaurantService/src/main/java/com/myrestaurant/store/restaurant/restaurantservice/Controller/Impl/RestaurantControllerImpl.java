package com.myrestaurant.store.restaurant.restaurantservice.Controller.Impl;

import com.myrestaurant.store.restaurant.restaurantservice.Controller.RestaurantController;
import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantDTO;
import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantIdsDTO;
import com.myrestaurant.store.restaurant.restaurantservice.Mapper.RestaurantMapper;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Restaurant;
import com.myrestaurant.store.restaurant.restaurantservice.Service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/restaurants")
@RequiredArgsConstructor
public class RestaurantControllerImpl implements RestaurantController {
    private final RestaurantService restaurantService;
    private final RestaurantMapper restaurantMapper;

    @Value("${app.pizza-service-url}")
    private String pizzaServiceUrl;


    @Value("${app.rabbitmq.add-pizzas-routingkey}")
    private String routingKey;
    private final RabbitTemplate rabbitTemplate;

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("addPizzas")
    public List<Object> addPizzaToRestaurant(@RequestBody List<RestaurantIdsDTO> restaurantIdsDTOS) {
        restaurantService.addPizzasToRestaurant(restaurantIdsDTOS);
        return null;
    }


    @Override
    @GetMapping("/pizzas/{id}")
    public List<Object> getPizzasByRestaurant(@PathVariable("id") Long restaurantId) {
        RestTemplate restTemplate = new RestTemplate();
        return List.of(Objects.requireNonNull(restTemplate.getForObject(pizzaServiceUrl + "/" + restaurantId, Object[].class)));
    }



    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO) {
        Restaurant restaurant = restaurantMapper.asEntity(restaurantDTO);
        return restaurantMapper.asDTO(restaurantService.save(restaurant));
    }

    @Override
    @GetMapping("/{id}")
    public RestaurantDTO findById(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.findById(id).orElse(null);
        return restaurantMapper.asDTO(restaurant);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        restaurantService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<RestaurantDTO> list() {
        return restaurantMapper.asDTOlist(restaurantService.findAll());
    }

    @Override
    @PutMapping("/{id}")
    public RestaurantDTO update(@RequestBody RestaurantDTO restaurantDTO, @PathVariable("id") Long id) {
        Restaurant restaurant = restaurantMapper.asEntity(restaurantDTO);
        return restaurantMapper.asDTO(restaurantService.update(restaurant, id));
    }
}
