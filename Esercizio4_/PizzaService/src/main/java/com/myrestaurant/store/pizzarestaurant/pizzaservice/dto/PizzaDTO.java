package com.myrestaurant.store.pizzarestaurant.pizzaservice.dto;

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

    private Set<ToppingDTO> toppings = new HashSet<>();
}
