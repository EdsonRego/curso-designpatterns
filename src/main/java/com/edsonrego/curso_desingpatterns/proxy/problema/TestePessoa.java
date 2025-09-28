package com.edsonrego.curso_desingpatterns.proxy.problema;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;
import com.edsonrego.curso_desingpatterns.proxy.PessoaRepository;
import com.edsonrego.curso_desingpatterns.proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {

//        PessoaService pessoaService = new PessoaService(new PessoaRepository());
//
//        Pessoa pessoa = new Pessoa.PessoaBuilder()
//                .sobreNome("Rego")
//                .dataNascimento(LocalDate.of(1982, 05,20))
//                .nome("Edson")
//                .apelido("Gomes")
//                .documento("123456")
//                .build();
//
//        pessoaService.save(pessoa);
//
//        Pessoa pessoaRetornada = pessoaService.findById(1L);
//        System.out.println(pessoaRetornada);
    }
}
