package com.myrestaurant.store.pizzarestaurantservice.Service.Implementation;

import com.myrestaurant.store.pizzarestaurantservice.DAO.RestaurantRepo;
import com.myrestaurant.store.pizzarestaurantservice.Model.Restaurant;
import com.myrestaurant.store.pizzarestaurantservice.Service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepo restaurantRepo;

    @Override
    public Restaurant save(Restaurant entity) {
        return restaurantRepo.save(entity);
    }

    @Override
    public List<Restaurant> save(List<Restaurant> entities) {
        return restaurantRepo.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        restaurantRepo.deleteById(id);
    }

    @Override
    public Optional<Restaurant> findById(Long id) {
        return restaurantRepo.findById(id);
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant update(Restaurant entity, Long id) {
        Optional<Restaurant> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;

    }

    @Override
    public Restaurant addPizzasToRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }
}
