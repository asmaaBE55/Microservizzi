package com.myrestaurant.store.pizzarestaurantservice;

import com.myrestaurant.store.pizzarestaurantservice.DAO.PizzaRepo;
import com.myrestaurant.store.pizzarestaurantservice.Model.Pizza;
import com.myrestaurant.store.pizzarestaurantservice.Model.Topping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class PizzaRestaurantServiceApplicationTests {
    @Autowired
    PizzaRepo pizzaRepo;
    @Test
    void populateDB() {
        Topping mozzarella = Topping.builder()
                .name("Mozzarella locale")
                .build();

        Topping pomodoro = Topping.builder()
                .name("pomodoro")
                .build();

        Topping basilico = Topping.builder()
                .name("Basilico")
                .build();


        Pizza margherita = Pizza.builder()
                .name("Margherita")
                .favorite(true)
                .toppings(Set.of(mozzarella, pomodoro, basilico))
                .build();

        pizzaRepo.saveAll(List.of(margherita));
    }
}
