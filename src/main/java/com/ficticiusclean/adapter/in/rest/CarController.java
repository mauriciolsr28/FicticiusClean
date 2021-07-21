package com.ficticiusclean.adapter.in.rest;

import com.ficticiusclean.adapter.in.rest.dto.CarDTO;
import com.ficticiusclean.adapter.out.datastore.CarRepository;
import com.ficticiusclean.adapter.out.datastore.entity.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<CarDTO> getAllCars() {
        return repository.findAll().stream().map(car -> CarDTO.builder()
                .id(car.getId())
                .name(car.getName())
                .brand(car.getBrand())
                .model(car.getModel())
                .manufacturingData(car.getManufacturingData().toString())
                .cityConsumption(car.getCityConsumption())
                .highwayConsumption(car.getHighwayConsumption())
                .build()
        ).collect(Collectors.toList());
    }

    @PostMapping
    public CarDTO registerCars(CarDTO car) {
        CarEntity carEntity = repository.save(CarEntity.builder()
                 .id(car.getId())
                 .name(car.getName())
                 .brand(car.getBrand())
                 .model(car.getModel())
                 .manufacturingData(LocalDateTime.parse(car.getManufacturingData()))
                 .cityConsumption(car.getCityConsumption())
                 .highwayConsumption(car.getHighwayConsumption())
                 .build()
        );
        car.setId(carEntity.getId());
        return car;
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@RequestParam("id") String id) {
        // TODO - Arrumar
    }

    @PutMapping("/{id}")
    public void updateCar(CarDTO car) {
        // TODO - Arrumar
    }
}
