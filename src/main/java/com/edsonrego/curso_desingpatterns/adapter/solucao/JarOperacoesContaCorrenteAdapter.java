package com.edsonrego.curso_desingpatterns.adapter.solucao;

import com.edsonrego.curso_desingpatterns.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    public void saca(BigDecimal valorPretendido){
        if(jarConta.validaSaldo(valorPretendido)){
            jarConta.saca(valorPretendido);
        }else {
            throw new IllegalArgumentException("Valor para saque não permitido");
        }
      //  System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor){
        jarConta.deposita(valor);
    }
}
