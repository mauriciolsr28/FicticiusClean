package com.ficticiusclean.adapter.out.datastore;

import com.ficticiusclean.adapter.out.datastore.entity.PredictionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends  JpaRepository<PredictionEntity, Integer> {}
