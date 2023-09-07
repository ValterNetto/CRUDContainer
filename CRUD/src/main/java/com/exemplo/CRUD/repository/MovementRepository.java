package com.exemplo.CRUD.repository;


import com.exemplo.CRUD.model.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementRepository extends JpaRepository<Movement, Long> {
    void deleteByIdMovement(Long idMovement);

    boolean existsByIdContainerMovement(Long idContainer);

    void deleteByIdContainerMovement(Long idContainerMovement);
}
