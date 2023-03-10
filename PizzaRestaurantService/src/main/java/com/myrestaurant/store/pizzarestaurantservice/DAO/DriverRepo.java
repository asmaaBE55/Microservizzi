package com.myrestaurant.store.pizzarestaurantservice.DAO;

import com.myrestaurant.store.pizzarestaurantservice.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {
}
