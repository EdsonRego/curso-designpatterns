package com.edsonrego.curso_desingpatterns.templatemethod.problema;

import com.edsonrego.curso_desingpatterns.templatemethod.VeiculoParaReparo;

public class TesteReparoVeiculo {

    public static void main(String[] args) {

        System.out.println("Luxo");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparoVeiculoLuxoService rpl = new ReparoVeiculoLuxoService(veiculoDeLuxo);
        rpl.reparaVeiculo();
        System.out.println("------------------");

        System.out.println("Comum");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoComumService rpc = new ReparoVeiculoComumService(veiculoComum);
        rpc.reparaVeiculo();
        System.out.println("------------------");




    }
}
