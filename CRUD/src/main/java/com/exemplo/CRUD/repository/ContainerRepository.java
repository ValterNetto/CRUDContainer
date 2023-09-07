package com.exemplo.CRUD.repository;

import com.exemplo.CRUD.model.Container;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Long> {

    void deleteByIdContainer(Long idContainer);

    List<Container> findByStatusContainer(String statusContainer);

    List<Container> findByCategoria(String categoria);
}
