package com.myrestaurant.store.restaurant.restaurantservice.Service.Impl;


import com.myrestaurant.store.restaurant.restaurantservice.DAO.RestaurantRepo;
import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantIdsDTO;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Restaurant;
import com.myrestaurant.store.restaurant.restaurantservice.Service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepo restaurantRepo;
    private final RabbitTemplate rabbitTemplate;
    @Value("${app.rabbitmq.add-pizzas-routingkey}")
    private String addPizzasToRestaurantRoutingkey;
    @Override
    public void addPizzasToRestaurant(List<RestaurantIdsDTO> restaurantIdsDTOS) {
        rabbitTemplate.convertAndSend("", addPizzasToRestaurantRoutingkey, restaurantIdsDTOS);
    }
    @Override
    public Restaurant save(Restaurant entity) {
        return restaurantRepo.save(entity);
    }

    @Override
    public List<Restaurant> save(List<Restaurant> entities) {
        return restaurantRepo.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        restaurantRepo.deleteById(id);
    }

    @Override
    public Optional<Restaurant> findById(Long id) {
        return restaurantRepo.findById(id);
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant update(Restaurant entity, Long id) {
        Optional<Restaurant> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;

    }


}
