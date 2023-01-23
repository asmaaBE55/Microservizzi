package com.myrestaurant.store.pizzarestaurantservice.Controller.Impl;

import com.myrestaurant.store.pizzarestaurantservice.Controller.ToppingController;
import com.myrestaurant.store.pizzarestaurantservice.DTO.ToppingDTO;
import com.myrestaurant.store.pizzarestaurantservice.Mapper.ToppingMapper;
import com.myrestaurant.store.pizzarestaurantservice.Model.Topping;
import com.myrestaurant.store.pizzarestaurantservice.Service.ToppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toppings")
@RequiredArgsConstructor
public class ToppingControllerImpl implements ToppingController {
    private final ToppingService toppingService;
    private final ToppingMapper toppingMapper;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToppingDTO save(ToppingDTO toppingDTO) {
        Topping topping = toppingMapper.asEntity(toppingDTO);
        return toppingMapper.asDTO(toppingService.save(topping));
    }

    @Override
    @GetMapping("/{id}")
    public ToppingDTO findById(@PathVariable("id") Long id) {
        Topping topping=toppingService.findById(id).orElse(null);
        return toppingMapper.asDTO(topping);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
     toppingService.deleteById(id);
    }

    @Override
    public List<ToppingDTO> list() {
        return toppingMapper.asDTOlist(toppingService.findAll());
    }

    @Override
    public ToppingDTO update(ToppingDTO toppingDTO, Long id) {
      Topping topping=toppingMapper.asEntity(toppingDTO);
      return toppingMapper.asDTO(toppingService.update(topping,id));
    }
}
