package com.edsonrego.curso_desingpatterns.proxy;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;

import java.util.HashMap;

public class PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public void save(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public Pessoa findById(Long id){
        return pessoaRepository.findById(id);
    }
}
