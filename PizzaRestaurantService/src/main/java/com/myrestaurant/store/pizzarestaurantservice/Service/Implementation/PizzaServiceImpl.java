package com.myrestaurant.store.pizzarestaurantservice.Service.Implementation;

import com.myrestaurant.store.pizzarestaurantservice.DAO.PizzaRepo;
import com.myrestaurant.store.pizzarestaurantservice.Model.Pizza;
import com.myrestaurant.store.pizzarestaurantservice.Service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PizzaServiceImpl implements PizzaService {
    private final PizzaRepo pizzaRepo;

    @Override
    public Pizza save(Pizza entity) {
        return null;
    }

    @Override
    public List<Pizza> save(List<Pizza> entities) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Optional<Pizza> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Pizza> findAll() {
        return null;
    }

    @Override
    public Pizza update(Pizza entity, Long id) {
        return null;
    }
}
