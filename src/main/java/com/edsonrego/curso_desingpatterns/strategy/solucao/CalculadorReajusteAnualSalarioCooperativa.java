package com.edsonrego.curso_desingpatterns.strategy.solucao;

import com.edsonrego.curso_desingpatterns.strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioCooperativa implements CalculadorReajusteAnualSalario{

    @Override
    public void calculaReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(BigDecimal.valueOf(0.07))));
    }
}
