package com.myrestaurant.store.pizzarestaurantservice.Service;

import com.myrestaurant.store.pizzarestaurantservice.Model.Restaurant;

public interface RestaurantService extends GenericService<Restaurant, Long> {
    Restaurant addPizzasToRestaurant(Restaurant restaurant);


}
