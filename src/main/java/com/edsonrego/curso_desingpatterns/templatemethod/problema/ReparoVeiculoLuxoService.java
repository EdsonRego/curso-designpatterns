package com.edsonrego.curso_desingpatterns.templatemethod.problema;

import com.edsonrego.curso_desingpatterns.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoLuxoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoLuxoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();

        if(veiculoParaReparo()){
            repararVeiculo();  // chama o método correto
            notificaReparoParaSeguradora();
        }else{
            notificaPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo(){
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }

    private void notificaPerdaTotalParaSeguradora(){
        System.out.println("Notificando perda total para Seguradora...");
    }
    private void notificaReparoParaSeguradora(){
        System.out.println("Notificando Reparo para Seguradora..");
    }

    private void repararVeiculo(){
        System.out.println("Reparando Veículo...");
    }

    private void analisarDanos(){
        System.out.println("Analisado danos...");
    }

    private void entradaOficina(){
        System.out.println("Veículo entrando na oficina..");
    }
}
