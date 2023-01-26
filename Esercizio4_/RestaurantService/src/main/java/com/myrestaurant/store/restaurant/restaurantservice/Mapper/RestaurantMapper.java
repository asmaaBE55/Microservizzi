package com.myrestaurant.store.restaurant.restaurantservice.Mapper;


import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantDTO;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends GenericMapper<Restaurant, RestaurantDTO> {
}
