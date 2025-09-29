package com.edsonrego.curso_desingpatterns.chainofresponsability.solucao;

import com.edsonrego.curso_desingpatterns.chainofresponsability.Carro;
import com.edsonrego.curso_desingpatterns.chainofresponsability.Marca;

import java.math.BigDecimal;

public class SemDesconto extends DescontoCarro{

    public SemDesconto(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
