package com.ficticiusclean.adapter.in.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePredictionDTO {

    private String name;
    private String brand;
    private String model;
    private String manufacturingDate;
    private Double amountFuel;
    private Double totalAmountSpentFuel;
}
