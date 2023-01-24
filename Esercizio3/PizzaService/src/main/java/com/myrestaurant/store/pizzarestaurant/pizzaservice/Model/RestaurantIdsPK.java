package com.myrestaurant.store.pizzarestaurant.pizzaservice.Model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RestaurantIdsPK implements Serializable {
    private Long restaurantId;
    private Long pizzaId;

}
