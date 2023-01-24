package com.myrestaurant.store.restaurant.restaurantservice.DAO;


import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantDTO;
import com.myrestaurant.store.restaurant.restaurantservice.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
    Restaurant addPizzasToRestaurant(RestaurantDTO restaurantDTO);
}