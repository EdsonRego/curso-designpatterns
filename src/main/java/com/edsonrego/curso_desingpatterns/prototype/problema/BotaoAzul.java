package com.edsonrego.curso_desingpatterns.prototype.problema;

import com.edsonrego.curso_desingpatterns.prototype.Botao;
import com.edsonrego.curso_desingpatterns.prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul(){
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
