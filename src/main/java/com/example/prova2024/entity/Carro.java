package com.example.prova2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, max = 15, message = "O nome deve conter de 3 a 15 caracteres")
    private String modelo;

    @Size(min = 2, max = 15, message = "O nome deve conter de 3 a 15 caracteres")
    private String marca;

    @Min(value = 1885, message = "O número minimo é 1885")
    @Max(value = 2024, message = "O numero maximo é 2024")
    private int ano;

    private String cor;

    @Min(value = 1, message = "O número minimo é 1")
    @Max(value = 2500, message = "O numero maximo é 2500")
    private double preco;

    @Min(value = 0, message = "O número minimo é 0")
    @Max(value = 150, message = "O numero maximo é 150")
    private double quilometragem;

    private Tipo tipo;

    private LocalDate dataCadastro;
    @ManyToOne
    private Proprietario proprietario;
}
