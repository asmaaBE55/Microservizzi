package com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.RestaurantIdsDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.RestaurantIds;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantIdsMapper extends GenericMapper<RestaurantIds, RestaurantIdsDTO> {
}
