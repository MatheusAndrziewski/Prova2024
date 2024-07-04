package com.example.prova2024.controller;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.service.CarroService;
import com.example.prova2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carro")
public class CarroController {

    @Autowired
    CarroService carroService;

    @GetMapping("buscar")
    public List<Carro> buscarProprietario() {
        return carroService.buscarCarros();
    }

    @PostMapping("cadastrar")
    public String cadastrarCarro(@RequestBody  Carro carro) {
       carroService.cadastrarCarro(carro);
        return " Carro cadastrado com sucesso";
    }

    @PutMapping("atualizar")
    public String atualizarCarro(@RequestBody Carro carro) {
      carroService.atualizarCarro(carro);
        return "Carro atualizado com sucesso";
    }
    @DeleteMapping("deletar/{id}")
    public String apagarCarro(@PathVariable Long id) {
       carroService.delete(id);
        return "Deletado com Sucesso";
    }
}
