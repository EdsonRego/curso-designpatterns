package com.edsonrego.curso_desingpatterns.proxy.solucao;

import com.edsonrego.curso_desingpatterns.bulder.Pessoa;
import com.edsonrego.curso_desingpatterns.proxy.PessoaRepository;

import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository {

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do método save()...");
        super.save(pessoa);
        log.info("Chamada do método save() finalizada...");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do método findById()...");
        Pessoa pessoa = super.findById(id);
        log.info("Chamada do método findById() finalizada...");
        return pessoa;
    }
}
