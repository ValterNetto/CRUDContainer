package com.exemplo.CRUD.controller;

import com.exemplo.CRUD.model.Container;
import com.exemplo.CRUD.repository.ContainerRepository;
import com.exemplo.CRUD.repository.MovementRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/container")
public class ContainerController {

    @Autowired
    public ContainerRepository containerRepository;
    @Autowired
    public MovementRepository movementRepository;

    @GetMapping
    public List<Container> listar(){
        return containerRepository.findAll();
    }

    @PostMapping
    public Container adicionar(@RequestBody Container container){
        return containerRepository.save(container);
    }

    @PutMapping
    public Container atualizar(@RequestBody Container container){
        return containerRepository.save(container);
    }

    @Transactional
    @DeleteMapping("/{idContainer}")
    public void delete(@PathVariable Long idContainer){
        if(movementRepository.existsByIdContainerMovement(idContainer)){
            movementRepository.deleteByIdContainerMovement(idContainer);
        }
        containerRepository.deleteByIdContainer(idContainer);
    }

    @GetMapping("/status")
    public List<Container> filtrarStatus(@RequestParam String statusContainer){
        return containerRepository.findByStatusContainer(statusContainer);
    }


    @GetMapping("/categoria")
    public List<Container> filtrarCategoria(@RequestParam String categoria){
        return containerRepository.findByCategoria(categoria);
    }
}
