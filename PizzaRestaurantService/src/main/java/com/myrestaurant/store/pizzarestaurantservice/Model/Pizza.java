package com.myrestaurant.store.pizzarestaurantservice.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Builder
@Table(name = "pizzas")
public class Pizza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private Long id;
    @NotBlank
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Column(name = "favorite")
    private boolean favorite;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "pizzas_toppings",
            joinColumns = @JoinColumn(
                    name = "pizza_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "topping_id", referencedColumnName = "topping_id"
            )
    )
    private Set<Topping> toppings = new HashSet<>();
}
