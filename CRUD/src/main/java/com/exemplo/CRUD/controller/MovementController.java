package com.exemplo.CRUD.controller;

import com.exemplo.CRUD.model.Movement;
import com.exemplo.CRUD.repository.MovementRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/movement")
public class MovementController {

    @Autowired
    public MovementRepository movementRepository;

    @GetMapping
    public List<Movement> listar(){
        return movementRepository.findAll();
    }

    @PostMapping
    public Movement adicionar(@RequestBody Movement movement){
        return movementRepository.save(movement);
    }

    @PutMapping
    public Movement atualizar(@RequestBody Movement movement){
        return movementRepository.save(movement);
    }

    @Transactional
    @DeleteMapping("/{idMovement}")
    public void delete(@PathVariable Long idMovement){
        movementRepository.deleteByIdMovement(idMovement);
    }
}
