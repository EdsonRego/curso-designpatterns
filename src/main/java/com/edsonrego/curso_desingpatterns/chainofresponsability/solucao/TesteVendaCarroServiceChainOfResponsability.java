package com.edsonrego.curso_desingpatterns.chainofresponsability.solucao;

import com.edsonrego.curso_desingpatterns.chainofresponsability.Carro;
import com.edsonrego.curso_desingpatterns.chainofresponsability.Marca;
import com.edsonrego.curso_desingpatterns.chainofresponsability.problema.VendaCarroService;

import java.math.BigDecimal;

public class TesteVendaCarroServiceChainOfResponsability {

    public static void main(String[] args) {
        VendaCarroServiceChainOfResponsability vendaCarroService = new VendaCarroServiceChainOfResponsability();

        Carro carro1 = new Carro();
        carro1.setMarca(Marca.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(90_000.00));

        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
        System.out.println("Valor da venda Fusion " + carro1.getPreco());
        System.out.println("Valor da venda Fusion com desconto " + valorVenda1);

        Carro carro2 = new Carro();
        carro2.setMarca(Marca.FIAT);
        carro2.setModelo("Uno");
        carro2.setPreco(new BigDecimal(40_000.00));

        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);
        System.out.println("Valor da venda Uno " + carro2.getPreco());
        System.out.println("Valor da venda Uno com desconto " + valorVenda2);

        Carro carro3 = new Carro();
        carro3.setMarca(Marca.CHEVROLET);
        carro3.setModelo("Camaro");
        carro3.setPreco(new BigDecimal(200_000.00));

        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);
        System.out.println("Valor da venda Camaro " + carro3.getPreco());
        System.out.println("Valor da venda Camaro com desconto " + valorVenda3);

    }
}
