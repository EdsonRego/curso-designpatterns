package com.edsonrego.curso_desingpatterns.adapter.problema;

import java.math.BigDecimal;

public class TesteJarOperacoesContaCorrente {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        if(client.validaSaldo(valorPretendidoParaSaque)){ //1a chamada
            client.saca(valorPretendidoParaSaque); //2a chamada
        }

        client.deposita(new BigDecimal(500)); //3a chamada
    }
}
