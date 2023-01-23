package com.myrestaurant.store.pizzarestaurantservice.Service;

import com.myrestaurant.store.pizzarestaurantservice.Model.Pizza;

import java.util.List;

public interface PizzaService extends GenericService<Pizza, Long> {
    List<Pizza> findByRestaurantsId(Long restaurantId);

}
