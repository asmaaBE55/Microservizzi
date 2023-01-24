package com.myrestaurant.store.restaurant.restaurantservice.Controller;

import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantDTO;
import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantIdsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Restaurant Api")
public interface RestaurantController {



    @ApiOperation("add Pizza to Restaurant")
    public List<Object> addPizzaToRestaurant(@RequestBody List<RestaurantIdsDTO> restaurantIdsDTOS);


    @ApiOperation("Find all pizzas by restaurant id")
    public List<Object> getPizzasByRestaurant(@PathVariable("id") Long restaurantId);

    @ApiOperation("Add new restaurant")
    RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO);

    @ApiOperation("Find restaurant by Id")
    RestaurantDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete by Id")
    void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all restaurants ")
    List<RestaurantDTO> list();

    @ApiOperation("Update restaurant")
    RestaurantDTO update(@RequestBody RestaurantDTO restaurantDTO, @PathVariable("id") Long id);
}
