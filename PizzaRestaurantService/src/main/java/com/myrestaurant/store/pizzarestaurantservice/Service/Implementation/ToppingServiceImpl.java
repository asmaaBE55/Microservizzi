package com.myrestaurant.store.pizzarestaurantservice.Service.Implementation;

import com.myrestaurant.store.pizzarestaurantservice.DAO.ToppingRepo;
import com.myrestaurant.store.pizzarestaurantservice.Model.Topping;
import com.myrestaurant.store.pizzarestaurantservice.Service.ToppingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ToppingServiceImpl implements ToppingService {
    private final ToppingRepo toppingRepo;

    public Topping save(Topping entity) {
        return toppingRepo.save(entity);
    }

    @Override
    public List<Topping> save(List<Topping> entities) {
        return toppingRepo.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        toppingRepo.deleteById(id);
    }

    @Override
    public Optional<Topping> findById(Long id) {
        return toppingRepo.findById(id);
    }

    @Override
    public List<Topping> findAll() {
        return toppingRepo.findAll();
    }

    @Override
    public Topping update(Topping entity, Long id) {
        Optional<Topping> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}
