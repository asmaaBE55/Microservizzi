package com.myrestaurant.store.pizzarestaurant.pizzaservice.DAO;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepo extends JpaRepository<Topping, Long> {
}
