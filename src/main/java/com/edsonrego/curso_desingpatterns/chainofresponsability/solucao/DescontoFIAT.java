package com.edsonrego.curso_desingpatterns.chainofresponsability.solucao;

import com.edsonrego.curso_desingpatterns.chainofresponsability.Carro;
import com.edsonrego.curso_desingpatterns.chainofresponsability.Marca;

import java.math.BigDecimal;

public class DescontoFIAT extends DescontoCarro{

    public DescontoFIAT(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(Marca.FIAT.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000));
        }

        return proximoDesconto.aplicaDesconto(carro);
    }
}
