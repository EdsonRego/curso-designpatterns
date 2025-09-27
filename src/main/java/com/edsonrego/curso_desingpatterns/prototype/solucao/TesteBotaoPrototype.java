package com.edsonrego.curso_desingpatterns.prototype.solucao;

import com.edsonrego.curso_desingpatterns.prototype.Botao;
import com.edsonrego.curso_desingpatterns.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

    public static void main(String[] args) {

        //Aqui no registry, ficam registrado os protótipos
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);
        botaoAmarelo.setLargura(200);
        System.out.println(botaoAmarelo);
        Botao botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo2);

        String chave = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(50);
        botaoPreto.setLargura(300);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);
        BotaoRegistry.addRegistry(chave, botaoPreto);

        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);


    }
}
