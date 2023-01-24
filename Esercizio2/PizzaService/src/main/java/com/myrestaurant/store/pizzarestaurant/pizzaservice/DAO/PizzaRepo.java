package com.myrestaurant.store.pizzarestaurant.pizzaservice.DAO;

import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Pizza;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Long> {
    List<Pizza> findByRestaurantsIn(List<Restaurant> restaurants);
}
