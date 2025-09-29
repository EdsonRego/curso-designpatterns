package com.edsonrego.curso_desingpatterns.chainofresponsability.problema;

import com.edsonrego.curso_desingpatterns.chainofresponsability.Carro;
import com.edsonrego.curso_desingpatterns.chainofresponsability.Marca;

import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calculaValorVenda(Carro carro){
        BigDecimal valorVenda = carro.getPreco();

        if(Marca.FIAT.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000));
        }

        if(Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }

        if(carro.getPreco().compareTo(new BigDecimal(100_000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10_000));
        }

        return valorVenda;
    }
}
