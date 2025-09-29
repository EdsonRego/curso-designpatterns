package com.edsonrego.curso_desingpatterns.templatemethod.solucao;

import com.edsonrego.curso_desingpatterns.templatemethod.VeiculoParaReparo;
import com.edsonrego.curso_desingpatterns.templatemethod.problema.ReparoVeiculoComumService;
import com.edsonrego.curso_desingpatterns.templatemethod.problema.ReparoVeiculoLuxoService;

public class TesteReparoVeiculoTemplateMethod {

    public static void main(String[] args) {

        System.out.println("Luxo");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparoVeiculoService rpl = new ReparoVeiculoLuxoServiceTemplateMethod(veiculoDeLuxo);
        rpl.reparaVeiculo();
        System.out.println("------------------");

        System.out.println("Comum");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparoVeiculoComumServiceTemplateMethod(veiculoComum);
        rpc.reparaVeiculo();
        System.out.println("------------------");




    }
}
