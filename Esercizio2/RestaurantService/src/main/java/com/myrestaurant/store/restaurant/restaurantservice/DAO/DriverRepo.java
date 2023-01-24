package com.myrestaurant.store.restaurant.restaurantservice.DAO;


import com.myrestaurant.store.restaurant.restaurantservice.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {
}
