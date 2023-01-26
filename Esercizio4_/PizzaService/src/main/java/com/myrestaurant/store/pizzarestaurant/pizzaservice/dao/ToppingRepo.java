package com.myrestaurant.store.pizzarestaurant.pizzaservice.dao;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepo extends JpaRepository<Topping, Long> {
}
