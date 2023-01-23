package com.myrestaurant.store.pizzarestaurantservice.Controller;

import com.myrestaurant.store.pizzarestaurantservice.DTO.RestaurantDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Restaurant Api")
public interface RestaurantController {
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
