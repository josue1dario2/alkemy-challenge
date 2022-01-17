package com.alkemy.preaceleracion.repositories;

import com.alkemy.preaceleracion.entities.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity,Long> {
}
