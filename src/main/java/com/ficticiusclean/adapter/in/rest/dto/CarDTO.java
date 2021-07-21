package com.ficticiusclean.adapter.in.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDTO {

    private Integer id;
    private String name;
    private String brand;
    private String model;
    private String manufacturingData;
    private String cityConsumption;
    private String highwayConsumption;
}
