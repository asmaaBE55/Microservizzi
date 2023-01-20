package com.myrestaurant.store.pizzarestaurantservice.Mapper;

import com.myrestaurant.store.pizzarestaurantservice.DTO.PizzaDTO;
import com.myrestaurant.store.pizzarestaurantservice.Model.Pizza;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PizzaMapper extends GenericMapper<Pizza, PizzaDTO> {
}
