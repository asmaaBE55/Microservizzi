package com.myrestaurant.store.pizzarestaurant.pizzaservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "restaurant_ids")
@IdClass(RestaurantIdsPK.class)
public class RestaurantIds implements Serializable {

    @Id
    private Long restaurantId;
    @Id
    private Long pizzaId;

}
