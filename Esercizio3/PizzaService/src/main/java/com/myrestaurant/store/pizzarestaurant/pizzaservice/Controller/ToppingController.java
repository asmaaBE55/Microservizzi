package com.myrestaurant.store.pizzarestaurant.pizzaservice.Controller;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.ToppingDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Topping Api")
public interface ToppingController {

    @ApiOperation("Add new topping")
    ToppingDTO save(@RequestBody ToppingDTO toppingDTO);

    @ApiOperation("Find topping by Id")
    ToppingDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete by Id")
    void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all toppings ")
    List<ToppingDTO> list();

    @ApiOperation("Update topping")
    ToppingDTO update(@RequestBody ToppingDTO toppingDTO, @PathVariable("id") Long id);

}