package com.example.prova2024.service;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.repository.CarroRepository;
import com.example.prova2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietarioService {
    @Autowired
    ProprietarioRepository proprietarioRepository;

    public List<Proprietario> buscarProprietarios() {
        return proprietarioRepository.findAll();

    }

    public Proprietario cadastrarProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public Proprietario atualizarProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public void delete(Long id) {
        proprietarioRepository.deleteById(id);
    }
}
