package com.myrestaurant.store.pizzarestaurant.pizzaservice.dao;

import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Long> {

}
