package com.edsonrego.curso_desingpatterns.proxy.solucao;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;

public interface ProxyPessoa {
    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
