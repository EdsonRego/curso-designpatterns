package com.edsonrego.curso_desingpatterns.adapter.solucao;

import com.edsonrego.curso_desingpatterns.adapter.problema.JarOperacoesContaCorrente;
import com.edsonrego.curso_desingpatterns.adapter.solucao.ClientJarOperacoesContaCorrenteAdapter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque); //1a chamada

        client.deposita(new BigDecimal(500));//2a chamada
    }
}
