package com.myrestaurant.store.restaurant.restaurantservice.Mapper;


import com.myrestaurant.store.restaurant.restaurantservice.DTO.DriverDTO;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Driver;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper extends GenericMapper<Driver, DriverDTO> {
}
