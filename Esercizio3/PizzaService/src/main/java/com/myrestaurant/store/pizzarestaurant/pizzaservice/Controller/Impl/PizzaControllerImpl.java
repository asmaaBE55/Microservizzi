package com.myrestaurant.store.pizzarestaurant.pizzaservice.Controller.Impl;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.Controller.PizzaController;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.PizzaDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.RestaurantIdsDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper.PizzaMapper;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper.RestaurantIdsMapper;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Pizza;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.RestaurantIds;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
@RequiredArgsConstructor
public class PizzaControllerImpl implements PizzaController {
    private final PizzaService pizzaService;
    private final PizzaMapper pizzaMapper;
    private final RestaurantIdsMapper restaurantIdsMapper;
    @Override
    @GetMapping("/restaurant/{id}")
    public List<PizzaDTO> findPizzaByRestaurant(@PathVariable("id") Long restaurantId) {
        List<Pizza> pizzas = pizzaService.findByRestaurantId(restaurantId);
        return pizzaMapper.asDTOlist(pizzas);
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PizzaDTO save(@RequestBody PizzaDTO pizzaDTO) {
        Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
        return pizzaMapper.asDTO(pizzaService.save(pizza));
    }

    /**
     * STEPS DETTAGLIATE DEL METODO POST
     * Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
     * Pizza saved = pizzaService.save(pizza);
     * PizzaDTO dto = pizzaMapper.asDTO(pizzaService.save(saved));
     * return dto;
     **/
    @Override
    @GetMapping("/{id}")
    public PizzaDTO findById(@PathVariable Long id) {
        Pizza pizza = pizzaService.findById(id).orElse(null);
        return pizzaMapper.asDTO(pizza);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        pizzaService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<PizzaDTO> list() {
        return pizzaMapper.asDTOlist(pizzaService.findAll());
    }

    /**
     * STEPS DETTAGLIATE DEL METODO GET LIST
     * List<Pizza> pizzas = pizzaService.findAll();
     * return pizzaMapper.asDTOList(pizzas);
     **/

    @Override
    @PutMapping("/{id}")
    public PizzaDTO update(@RequestBody PizzaDTO pizzaDTO, @PathVariable("id") Long id) {
        Pizza pizza = pizzaMapper.asEntity(pizzaDTO);
        return pizzaMapper.asDTO(pizzaService.update(pizza, id));
    }

    @Override
    @PostMapping("/restaurant")
    public List<PizzaDTO> addPizzasToRestaurant(List<RestaurantIdsDTO> restaurantIdsDTOS) {
        List<RestaurantIds> restaurantIds=restaurantIdsMapper.asEntityList(restaurantIdsDTOS);
        return pizzaMapper.asDTOlist(pizzaService.addPizzasToRestaurant(restaurantIds));
    }
}
