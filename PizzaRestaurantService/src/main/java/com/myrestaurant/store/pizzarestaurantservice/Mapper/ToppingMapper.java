package com.myrestaurant.store.pizzarestaurantservice.Mapper;

import com.myrestaurant.store.pizzarestaurantservice.DTO.ToppingDTO;
import com.myrestaurant.store.pizzarestaurantservice.Model.Topping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToppingMapper extends GenericMapper<Topping, ToppingDTO> {
}
