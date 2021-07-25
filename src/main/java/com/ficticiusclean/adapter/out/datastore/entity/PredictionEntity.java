package com.ficticiusclean.adapter.out.datastore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "prediction")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PredictionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "price_gas")
    private String priceGas;

    @Column(name = "total_hm_city")
    private String totalKMCity;

    @Column(name = "total_hm_highway")
    private String totalKMHighway;
}
