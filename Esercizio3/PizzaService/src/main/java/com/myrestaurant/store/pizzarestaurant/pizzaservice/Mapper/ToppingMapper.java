package com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.ToppingDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Topping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToppingMapper extends GenericMapper<Topping, ToppingDTO> {
}
