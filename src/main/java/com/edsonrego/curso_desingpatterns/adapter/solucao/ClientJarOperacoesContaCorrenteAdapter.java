package com.edsonrego.curso_desingpatterns.adapter.solucao;

import com.edsonrego.curso_desingpatterns.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaAdapter){
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca(BigDecimal valorPretendido){
        jarContaAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor){
        jarContaAdapter.deposita(valor);
    }
}
