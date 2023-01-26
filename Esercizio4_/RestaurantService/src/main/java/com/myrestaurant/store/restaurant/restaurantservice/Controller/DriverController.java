package com.myrestaurant.store.restaurant.restaurantservice.Controller;

import com.myrestaurant.store.restaurant.restaurantservice.DTO.DriverDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Driver Api")
public interface DriverController {
    @ApiOperation("Add new driver")
    DriverDTO save(@RequestBody DriverDTO driverDTO);

    @ApiOperation("Find driver by Id")
    DriverDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete by Id")
    void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all drivers ")
    List<DriverDTO> list();

    @ApiOperation("Update driver")
    DriverDTO update(@RequestBody DriverDTO driverDTO, @PathVariable("id") Long id);

}
