package com.myrestaurant.store.pizzarestaurantservice.Service.Implementation;

import com.myrestaurant.store.pizzarestaurantservice.DAO.DriverRepo;
import com.myrestaurant.store.pizzarestaurantservice.Model.Driver;
import com.myrestaurant.store.pizzarestaurantservice.Service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepo driverRepo;

    @Override
    public Driver save(Driver entity) {
        return driverRepo.save(entity);
    }

    @Override
    public List<Driver> save(List<Driver> entities) {
        return driverRepo.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        driverRepo.deleteById(id);
    }

    @Override
    public Optional<Driver> findById(Long id) {
        return driverRepo.findById(id);
    }

    @Override
    public List<Driver> findAll() {
        return driverRepo.findAll();
    }

    @Override
    public Driver update(Driver entity, Long id) {
        Optional<Driver> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}
