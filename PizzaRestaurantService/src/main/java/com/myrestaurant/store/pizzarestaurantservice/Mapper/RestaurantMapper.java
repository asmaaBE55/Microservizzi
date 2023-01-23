package com.myrestaurant.store.pizzarestaurantservice.Mapper;

import com.myrestaurant.store.pizzarestaurantservice.DTO.RestaurantDTO;
import com.myrestaurant.store.pizzarestaurantservice.Model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends GenericMapper<Restaurant, RestaurantDTO> {
}
