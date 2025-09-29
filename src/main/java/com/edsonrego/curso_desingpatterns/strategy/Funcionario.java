package com.edsonrego.curso_desingpatterns.strategy;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private BigDecimal salario;
    private TipoContratacaoEnum tipoContratacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(TipoContratacaoEnum tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %-10s | Tipo: %-12s | Salário: R$ %,.2f",
                nome,
                tipoContratacao,
                salario);
    }
}
