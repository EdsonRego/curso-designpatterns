package com.edsonrego.curso_desingpatterns.strategy.solucao;

import com.edsonrego.curso_desingpatterns.strategy.Funcionario;
import com.edsonrego.curso_desingpatterns.strategy.TipoContratacaoEnum;
import com.edsonrego.curso_desingpatterns.strategy.problema.ReajusteAnualSalario;

import java.math.BigDecimal;

public class TesteReajusteAnualSalarioStrategy {

    public static void main(String[] args) {

        ReajusteAnualSalarioStrategy reajusteAnualSalario = new ReajusteAnualSalarioStrategy();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Edson");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Eva");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Camilly");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(15000));

        Funcionario funcionarioCooperativa = new Funcionario();
        funcionarioCooperativa.setNome("Jose");
        funcionarioCooperativa.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
        funcionarioCooperativa.setSalario(new BigDecimal(1000));

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioCooperativa());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioCooperativa);
    }
}
