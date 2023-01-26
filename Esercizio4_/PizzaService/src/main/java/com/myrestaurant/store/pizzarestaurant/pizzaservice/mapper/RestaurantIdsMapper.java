package com.myrestaurant.store.pizzarestaurant.pizzaservice.mapper;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.dto.RestaurantIdsDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.RestaurantIds;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantIdsMapper extends GenericMapper<RestaurantIds, RestaurantIdsDTO> {
}
