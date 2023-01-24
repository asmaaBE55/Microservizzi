package com.myrestaurant.store.pizzarestaurant.pizzaservice.DAO;

import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.RestaurantIds;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.Model.RestaurantIdsPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantIdsRepository extends JpaRepository<RestaurantIds, RestaurantIdsPK> {
    List<RestaurantIds> findByRestaurantId(Long restaurantId);
}
