package com.edsonrego.curso_desingpatterns.factorymethods.solucao;

import com.edsonrego.curso_desingpatterns.factorymethods.Produto;
import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoDigital;
import com.edsonrego.curso_desingpatterns.factorymethods.TipoProdutoEnum;

public class TesteProdutoComFactory {

    public static void main(String[] args) {

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
