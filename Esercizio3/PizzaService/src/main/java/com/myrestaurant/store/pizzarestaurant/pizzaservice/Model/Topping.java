package com.myrestaurant.store.pizzarestaurant.pizzaservice.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
    @JsonIgnore
    private Set<Pizza> pizzas = new HashSet<>();
}
