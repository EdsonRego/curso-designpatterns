package com.edsonrego.curso_desingpatterns.factorymethods.problema;

import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoDigital;
import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);

    }
}
