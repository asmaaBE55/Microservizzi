package com.myrestaurant.store.restaurant.restaurantservice.DTO;

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
