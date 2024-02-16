package com.crio.starter.repository;

import com.crio.starter.data.MemeEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemeRepository extends MongoRepository<MemeEntity, Integer> {

    Optional<MemeEntity>findById(String id);
    boolean existsByNameAndUrlAndCaption(String name, String url, String caption);
    List<MemeEntity> findTop100ByOrderByCreatedAtDesc();
}