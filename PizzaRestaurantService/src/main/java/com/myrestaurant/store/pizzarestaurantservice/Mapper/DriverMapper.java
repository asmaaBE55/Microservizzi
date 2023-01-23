package com.myrestaurant.store.pizzarestaurantservice.Mapper;

import com.myrestaurant.store.pizzarestaurantservice.DTO.DriverDTO;
import com.myrestaurant.store.pizzarestaurantservice.Model.Driver;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper extends GenericMapper<Driver, DriverDTO>{
}
