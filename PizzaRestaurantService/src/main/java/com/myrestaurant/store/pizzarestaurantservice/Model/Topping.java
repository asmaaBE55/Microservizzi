package com.myrestaurant.store.pizzarestaurantservice.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "toppings")
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topping_id")
    private Long id;
    @NotBlank
    @Size(max = 255)
    private String name;
    @ManyToMany(mappedBy = "toppings")
    private Set<Pizza> pizzas = new HashSet<>();
}
