package com.edsonrego.curso_desingpatterns.bulder.solucao;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;

import java.time.LocalDate;

public class TestePessoaBuilder {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Edson")
                .sobreNome("Rego")
                .documento("asr456789")
                .email("edsonxrego@gmail.com")
                .apelido("Edson")
                .dataNascimento(LocalDate.of(1985, 9, 25))
                .build();

        System.out.println(pessoa);

        StringBuilder sb = new StringBuilder().append("Palavra 2").append("Palavra");
        System.out.println(sb);
    }
}
