package com.ficticiusclean.adapter.in.rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ficticiusclean.adapter.in.rest.dto.RequestCarDTO;
import com.ficticiusclean.adapter.in.rest.dto.ResponseCarDTO;
import com.ficticiusclean.adapter.out.datastore.CarRepository;
import com.ficticiusclean.adapter.out.datastore.entity.CarEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cars")
@AllArgsConstructor
public class CarController {

    private final CarRepository carRepository;
    private static final Logger log = Logger.getLogger(CarController.class.getName());

    //Retorna todos os carros
    @GetMapping
    public List<ResponseCarDTO> getAllCars() {
        return carRepository.findAll()
                .stream()
                .map(car -> ResponseCarDTO.builder()
                        .id(car.getId())
                        .name(car.getName())
                        .brand(car.getBrand())
                        .model(car.getModel())
                        .manufacturingDate(car.getManufacturingDate())
                        .cityConsumption(car.getCityConsumption())
                        .highwayConsumption(car.getHighwayConsumption())
                        .build()
                ).collect(Collectors.toList());
    }

    //Adiciona Carros Manualmente
    @PostMapping
    public ResponseCarDTO registerCars(@RequestBody RequestCarDTO car) {
        CarEntity carEntity = carRepository.save(CarEntity.builder()
                .name(car.getName())
                .brand(car.getBrand())
                .model(car.getModel())
                .manufacturingDate(car.getManufacturingDate())
                .cityConsumption(car.getCityConsumption())
                .highwayConsumption(car.getHighwayConsumption())
                .build()
        );

        return ResponseCarDTO.builder()
                .id(carEntity.getId())
                .name(carEntity.getName())
                .brand(carEntity.getBrand())
                .model(carEntity.getModel())
                .manufacturingDate(carEntity.getManufacturingDate())
                .cityConsumption(carEntity.getCityConsumption())
                .highwayConsumption(carEntity.getHighwayConsumption())
                .build();
    }

    //Inicializar os carros no Banco de Dados
    @GetMapping("/init")
    public void initTableOnlyTest() {
        String jsonListString = "[\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Logan\",\n" +
                "        \"brand\": \"Renault\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2012\",\n" +
                "        \"cityConsumption\": 10.0,\n" +
                "        \"highwayConsumption\": 12.0\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Ka\",\n" +
                "        \"brand\": \"Ford\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2010\",\n" +
                "        \"cityConsumption\": 9.7,\n" +
                "        \"highwayConsumption\": 12.5\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Uno\",\n" +
                "        \"brand\": \"Fiat\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2010\",\n" +
                "        \"cityConsumption\": 9.7,\n" +
                "        \"highwayConsumption\": 16.0\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Palio\",\n" +
                "        \"brand\": \"Fiat\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2010\",\n" +
                "        \"cityConsumption\": 10.7,\n" +
                "        \"highwayConsumption\": 13.5\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Marea\",\n" +
                "        \"brand\": \"Fiat\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2002\",\n" +
                "        \"cityConsumption\": 7.5,\n" +
                "        \"highwayConsumption\": 10.2\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Argo\",\n" +
                "        \"brand\": \"Fiat\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2021\",\n" +
                "        \"cityConsumption\": 10.5,\n" +
                "        \"highwayConsumption\": 16.3\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Edge\",\n" +
                "        \"brand\": \"Ford\",\n" +
                "        \"model\": \"SUV\",\n" +
                "        \"manufacturingDate\": \"2020\",\n" +
                "        \"cityConsumption\": 9.7,\n" +
                "        \"highwayConsumption\": 11.5\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Fiesta\",\n" +
                "        \"brand\": \"Ford\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2012\",\n" +
                "        \"cityConsumption\": 8.7,\n" +
                "        \"highwayConsumption\": 10.5\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Corolla\",\n" +
                "        \"brand\": \"Toyota\",\n" +
                "        \"model\": \"Sedan\",\n" +
                "        \"manufacturingDate\": \"2018\",\n" +
                "        \"cityConsumption\": 9.7,\n" +
                "        \"highwayConsumption\": 14.5\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Clio\",\n" +
                "        \"brand\": \"Renault\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2018\",\n" +
                "        \"cityConsumption\": 11.3,\n" +
                "        \"highwayConsumption\": 12.5\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"Captur\",\n" +
                "        \"brand\": \"Renault\",\n" +
                "        \"model\": \"Hatch\",\n" +
                "        \"manufacturingDate\": \"2021\",\n" +
                "        \"cityConsumption\": 10.8,\n" +
                "        \"highwayConsumption\": 14.5\n" +
                "    }\n" +
                "]";
        //Tratamento de erro referente a inserção dos carros no banco de dados
        try {
            log.info("Iniciando Tabela de Carros!");
            List<CarEntity> cars = new ObjectMapper().readValue(jsonListString, new  TypeReference<List<CarEntity>>(){});
            carRepository.saveAll(cars);
        } catch (Exception e){
            log.log(Level.SEVERE, "Erro ao Iniciar a Tabela." , e);
        }
    }
}
