package com.edsonrego.curso_desingpatterns.bulder.solucao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal {
    private String nome;
    private String dono;
    private String raca;
}
