package com.edsonrego.curso_desingpatterns.prototype.problema;

import com.edsonrego.curso_desingpatterns.prototype.Botao;
import com.edsonrego.curso_desingpatterns.prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo(){
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
