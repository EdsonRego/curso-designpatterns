package com.edsonrego.curso_desingpatterns.prototype.solucao;

import com.edsonrego.curso_desingpatterns.prototype.Botao;
import com.edsonrego.curso_desingpatterns.prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho  = new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul  = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegistry getInstance(){
        if(Objects.isNull((botaoRegistry))){
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }
        return botaoRegistry;
    }

    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave,botao);
    }
}
