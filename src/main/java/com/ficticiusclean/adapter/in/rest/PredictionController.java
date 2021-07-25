package com.ficticiusclean.adapter.in.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ficticiusclean.adapter.in.rest.dto.RequestPredictionDTO;
import com.ficticiusclean.adapter.in.rest.dto.ResponsePredictionDTO;
import com.ficticiusclean.adapter.out.datastore.CarRepository;
import com.ficticiusclean.adapter.out.datastore.entity.CarEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Comparator.comparing;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("prediction")
@AllArgsConstructor
public class PredictionController {

    private final CarRepository carRepository;

    //Responsavél por trazer os carros de forma ordenada
    @PostMapping
    public List<ResponsePredictionDTO> getPrediction(@RequestBody RequestPredictionDTO prediction) {
        return carRepository.findAll()
                .stream()
                .map(car -> ResponsePredictionDTO.builder()
                        .name(car.getName())
                        .brand(car.getBrand())
                        .model(car.getModel())
                        .manufacturingDate(car.getManufacturingDate())
                        .amountFuel(getAmountFuel(car, prediction))
                        .totalAmountSpentFuel(getTotalAmountSpentFuel(car, prediction))
                        .build())
                .sorted(comparing(ResponsePredictionDTO::getTotalAmountSpentFuel))
                .collect(Collectors.toList());
    }

    //Realiza o Calculo de quanto de combustivel é necessario percorrer distancia.
    private Double getAmountFuel(CarEntity car, RequestPredictionDTO prediction) {
        Double resultKMCity = (prediction.getTotalKMCity()/car.getCityConsumption());
        Double resultKMHighway = (prediction.getTotalKMHighway()/car.getHighwayConsumption());

        return BigDecimal.valueOf(resultKMCity + resultKMHighway).
                setScale(3, RoundingMode.CEILING)
                .doubleValue();
    }

    //Total de gasto utilizando dados como kilometragem "/"  Consumo do Veiculo "*" Valor do Combustivel.
    private Double getTotalAmountSpentFuel(CarEntity car, RequestPredictionDTO prediction) {
        return BigDecimal.valueOf(getAmountFuel(car, prediction) * prediction.getPriceGas())
                .setScale(3, RoundingMode.CEILING)
                .doubleValue();
    }
}
