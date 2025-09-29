package com.edsonrego.curso_desingpatterns.templatemethod.solucao;

public abstract class ReparoVeiculoService {

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

    protected abstract boolean veiculoParaReparo();

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

    //Ao dixar como protected, permite-se a sobreescrita da implementação lá na subclasse
    protected void entradaOficina(){
        System.out.println("Veículo entrando na oficina..");
    }
}
