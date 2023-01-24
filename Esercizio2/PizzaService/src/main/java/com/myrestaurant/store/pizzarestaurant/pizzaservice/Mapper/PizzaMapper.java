package com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.PizzaDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Pizza;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PizzaMapper extends GenericMapper<Pizza, PizzaDTO> {
}
