package com.ficticiusclean.adapter.in.rest;

import com.ficticiusclean.adapter.in.rest.dto.PredictionDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

    @GetMapping
    public PredictionDTO getPrediction() {
        // TODO - Arrumar
        return null;
    }
}
