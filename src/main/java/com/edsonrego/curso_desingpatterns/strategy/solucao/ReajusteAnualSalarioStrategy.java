package com.edsonrego.curso_desingpatterns.strategy.solucao;

import com.edsonrego.curso_desingpatterns.strategy.Funcionario;
import com.edsonrego.curso_desingpatterns.strategy.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioStrategy {

    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador){
        calculador.calculaReajusteAnual(funcionario);
    }
}
