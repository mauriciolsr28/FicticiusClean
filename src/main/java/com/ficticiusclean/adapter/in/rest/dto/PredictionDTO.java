package com.ficticiusclean.adapter.in.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PredictionDTO {

    private String priceGas;
    private String totalKMCity;
    private String totalKMHighway;
}
