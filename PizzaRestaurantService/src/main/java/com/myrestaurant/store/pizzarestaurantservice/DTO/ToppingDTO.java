package com.myrestaurant.store.pizzarestaurantservice.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ToppingDTO {
    private Long id;
    private String name;

}
