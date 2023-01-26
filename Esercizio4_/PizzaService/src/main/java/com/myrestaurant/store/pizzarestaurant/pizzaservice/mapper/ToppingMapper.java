package com.myrestaurant.store.pizzarestaurant.pizzaservice.mapper;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.dto.ToppingDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.Topping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToppingMapper extends GenericMapper<Topping, ToppingDTO> {
}
