package com.myrestaurant.store.pizzarestaurantservice.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Set<Topping> toppings = new HashSet<>();
}
