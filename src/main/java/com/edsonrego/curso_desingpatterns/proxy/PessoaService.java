package com.edsonrego.curso_desingpatterns.proxy;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;
import com.edsonrego.curso_desingpatterns.proxy.solucao.PessoaRepositoryProxy;
import com.edsonrego.curso_desingpatterns.proxy.solucao.ProxyPessoa;

import java.util.HashMap;

public class PessoaService {

    private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa){
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa){
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id){
        return proxyPessoa.findById(id);
    }
}
