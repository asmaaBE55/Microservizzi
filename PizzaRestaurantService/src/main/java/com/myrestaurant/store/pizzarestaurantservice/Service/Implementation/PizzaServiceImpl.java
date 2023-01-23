package com.myrestaurant.store.pizzarestaurantservice.Service.Implementation;

import com.myrestaurant.store.pizzarestaurantservice.DAO.PizzaRepo;
import com.myrestaurant.store.pizzarestaurantservice.Model.Pizza;
import com.myrestaurant.store.pizzarestaurantservice.Model.Restaurant;
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
        return pizzaRepo.save(entity);
    }

    @Override
    public List<Pizza> save(List<Pizza> entities) {
        return pizzaRepo.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        pizzaRepo.deleteById(id);
    }

    @Override
    public Optional<Pizza> findById(Long id) {
        return pizzaRepo.findById(id);
    }

    @Override
    public List<Pizza> findAll() {
        return pizzaRepo.findAll();
    }

    @Override
    public Pizza update(Pizza entity, Long id) {
        Optional<Pizza> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }



    @Override
    public List<Pizza> findByRestaurantsId(Long restaurantId) {
        List<Pizza> pizzas = pizzaRepo.findByRestaurantsIn
                (List.of
                        (Restaurant.builder()
                                .id(restaurantId)
                                .build()));
        return pizzas;
    }
}
