package com.edsonrego.curso_desingpatterns.strategy.problema;

import com.edsonrego.curso_desingpatterns.strategy.Funcionario;
import com.edsonrego.curso_desingpatterns.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculaReajusteAnual(Funcionario funcionario){

        if (TipoContratacaoEnum.CLT.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(BigDecimal.valueOf(0.10))));
        } else if (TipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(BigDecimal.valueOf(0.05))));
        } else if (TipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(BigDecimal.valueOf(0.02))));
        }
    }
}
