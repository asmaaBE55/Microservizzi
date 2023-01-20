package com.myrestaurant.store.pizzarestaurantservice.DTO;

import com.myrestaurant.store.pizzarestaurantservice.Model.Topping;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class PizzaDTO {
    private long id;
    private String name;
    private boolean favorite;
    private Set<Topping> toppings = new HashSet<>();
}
