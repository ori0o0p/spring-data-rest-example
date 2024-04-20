package com.example.springdatarestexample.repository;

import com.example.springdatarestexample.model.ParkMinJu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "park_minju", path = "parkminju")
public interface ParkMinJuRepository extends PagingAndSortingRepository<ParkMinJu, Long> {
}
