package com.myrestaurant.store.restaurant.restaurantservice.Service;


import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantIdsDTO;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Restaurant;

import java.util.List;

public interface RestaurantService extends GenericService<Restaurant, Long> {
public void addPizzasToRestaurant(List<RestaurantIdsDTO> restaurantIdsDTOS);
}
