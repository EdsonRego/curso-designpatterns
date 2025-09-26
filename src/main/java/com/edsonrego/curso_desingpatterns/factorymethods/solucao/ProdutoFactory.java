package com.edsonrego.curso_desingpatterns.factorymethods.solucao;

import com.edsonrego.curso_desingpatterns.factorymethods.Produto;
import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoDigital;
import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoFisico;
import com.edsonrego.curso_desingpatterns.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum){

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }

    }
}
