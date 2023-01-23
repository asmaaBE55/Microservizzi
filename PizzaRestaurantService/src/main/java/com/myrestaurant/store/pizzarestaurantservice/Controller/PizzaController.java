package com.myrestaurant.store.pizzarestaurantservice.Controller;

import com.myrestaurant.store.pizzarestaurantservice.DTO.PizzaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Pizza Api")
public interface PizzaController {

    @ApiOperation("Find pizzas by restaurant id")
    public List<PizzaDTO> findByRestaurantsIn(@PathVariable ("id") Long restaurantId);

    @ApiOperation("Add new pizza")
    PizzaDTO save(@RequestBody PizzaDTO pizzaDTO);

    @ApiOperation("Find pizza by Id")
    PizzaDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete by Id")
    void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all pizzas ")
    List<PizzaDTO> list();

    @ApiOperation("Update pizza")
    PizzaDTO update(@RequestBody PizzaDTO pizzaDTO, @PathVariable("id") Long id);

}
