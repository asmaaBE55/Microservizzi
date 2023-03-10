package com.myrestaurant.store.pizzarestaurantservice.Controller.Impl;

import com.myrestaurant.store.pizzarestaurantservice.Controller.DriverController;
import com.myrestaurant.store.pizzarestaurantservice.DTO.DriverDTO;
import com.myrestaurant.store.pizzarestaurantservice.Mapper.DriverMapper;
import com.myrestaurant.store.pizzarestaurantservice.Model.Driver;
import com.myrestaurant.store.pizzarestaurantservice.Service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverControllerImpl implements DriverController {
    private final DriverService driverService;
    private final DriverMapper driverMapper;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DriverDTO save(@RequestBody DriverDTO driverDTO) {
        Driver driver = driverMapper.asEntity(driverDTO);
        return driverMapper.asDTO(driverService.save(driver));
    }

    @Override
    @GetMapping("/{id}")
    public DriverDTO findById(@PathVariable Long id) {
        Driver driver = driverService.findById(id).orElse(null);
        return driverMapper.asDTO(driver);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        driverService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<DriverDTO> list() {
        return driverMapper.asDTOlist(driverService.findAll());
    }

    @Override
    @PutMapping("/{id}")
    public DriverDTO update(@RequestBody DriverDTO driverDTO, @PathVariable("id") Long id) {
        Driver driver = driverMapper.asEntity(driverDTO);
        return driverMapper.asDTO(driverService.update(driver, id));
    }
}
