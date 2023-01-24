package com.myrestaurant.store.pizzarestaurant.pizzaservice.Controller.Impl;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.Controller.ToppingController;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.ToppingDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Mapper.ToppingMapper;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Topping;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Service.ToppingService;
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
        Topping topping = toppingService.findById(id).orElse(null);
        return toppingMapper.asDTO(topping);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        toppingService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<ToppingDTO> list() {
        return toppingMapper.asDTOlist(toppingService.findAll());
    }

    @Override
    @PutMapping("/{id}")
    public ToppingDTO update(ToppingDTO toppingDTO, Long id) {
        Topping topping = toppingMapper.asEntity(toppingDTO);
        return toppingMapper.asDTO(toppingService.update(topping, id));
    }
}
