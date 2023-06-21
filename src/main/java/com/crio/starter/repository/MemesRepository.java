package com.crio.starter.repository;

import com.crio.starter.data.MemesEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemesRepository extends MongoRepository<MemesEntity, Integer> {

}