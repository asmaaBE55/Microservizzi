package com.myrestaurant.store.pizzarestaurant.pizzaservice.Service;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Pizza;

import java.util.List;

public interface PizzaService extends GenericService<Pizza, Long> {
    List<Pizza> findByRestaurantId(Long restaurantId);
}
