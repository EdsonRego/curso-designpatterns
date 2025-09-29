package com.edsonrego.curso_desingpatterns.chainofresponsability.solucao;

import com.edsonrego.curso_desingpatterns.chainofresponsability.Carro;
import com.edsonrego.curso_desingpatterns.chainofresponsability.Marca;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorCemMil extends DescontoCarro{

    public DescontoCarroValorMaiorCemMil(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(carro.getPreco().compareTo(new BigDecimal(100_000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10_000));
        }

        return proximoDesconto.aplicaDesconto(carro);
    }
}
