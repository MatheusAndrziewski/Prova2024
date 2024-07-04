package com.example.prova2024.service;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CarroService {
    @Autowired
    CarroRepository carroRepository;

    public List<Carro> buscarCarros() {
        return carroRepository.findAll();

    }

    public Carro cadastrarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro atualizarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public void delete(Long id) {
        carroRepository.deleteById(id);
    }
}

