package com.ficticiusclean.adapter.out.datastore;

import com.ficticiusclean.adapter.out.datastore.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends  JpaRepository<CarEntity, Integer> {}
