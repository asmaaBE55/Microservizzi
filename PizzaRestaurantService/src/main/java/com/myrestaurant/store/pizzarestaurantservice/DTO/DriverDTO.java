package com.myrestaurant.store.pizzarestaurantservice.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class DriverDTO {
    private long id;
    private String name;

}
