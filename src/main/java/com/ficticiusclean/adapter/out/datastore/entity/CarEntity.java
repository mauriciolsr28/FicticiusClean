package com.ficticiusclean.adapter.out.datastore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cars")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "manufacturing_data")
    private LocalDateTime manufacturingData;

    @Column(name = "city_consumption")
    private String cityConsumption;

    @Column(name = "highway_consumption")
    private String highwayConsumption;
}
