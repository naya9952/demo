package com.ex.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
@RepositoryRestResource
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
