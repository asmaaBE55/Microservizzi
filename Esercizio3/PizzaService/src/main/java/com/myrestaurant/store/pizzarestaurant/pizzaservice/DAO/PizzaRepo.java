package com.myrestaurant.store.pizzarestaurant.pizzaservice.DAO;

import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Long> {

}
