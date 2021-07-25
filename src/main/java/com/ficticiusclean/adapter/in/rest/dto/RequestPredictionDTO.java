package com.ficticiusclean.adapter.in.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestPredictionDTO {

    private Double priceGas;
    private Double totalKMCity;
    private Double totalKMHighway;
}
