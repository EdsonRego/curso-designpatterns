package com.edsonrego.curso_desingpatterns.chainofresponsability.solucao;

import com.edsonrego.curso_desingpatterns.chainofresponsability.Carro;
import com.edsonrego.curso_desingpatterns.chainofresponsability.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceChainOfResponsability {

    public BigDecimal calculaValorVenda(Carro carro){

        DescontoCarro desconto = new DescontoFIAT(
                new DescontoFORD(
                        new DescontoCarroValorMaiorCemMil(
                                new SemDesconto(null))));

        return desconto.aplicaDesconto(carro);
    }
}
