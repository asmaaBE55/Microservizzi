package com.myrestaurant.store.pizzarestaurant.pizzaservice.Service;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.Pizza;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.RestaurantIds;

import java.util.List;

public interface PizzaService extends GenericService<Pizza, Long> {
    List<Pizza> findByRestaurantId(Long restaurantId);

    List<Pizza> addPizzasToRestaurant(List<RestaurantIds> restaurantIds);
}
