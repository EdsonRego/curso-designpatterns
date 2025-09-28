package com.edsonrego.curso_desingpatterns.proxy.solucao;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;
import com.edsonrego.curso_desingpatterns.proxy.PessoaService;

import java.time.LocalDate;

public class TesteNovoPessoaProxy {

    public static void main(String[] args) {

        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();

        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Rego")
                .dataNascimento(LocalDate.of(1982, 05,20))
                .nome("Edson")
                .apelido("Gomes")
                .documento("123456")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
