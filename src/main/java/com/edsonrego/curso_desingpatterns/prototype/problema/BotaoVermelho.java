package com.edsonrego.curso_desingpatterns.prototype.problema;

import com.edsonrego.curso_desingpatterns.prototype.Botao;
import com.edsonrego.curso_desingpatterns.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho(){
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }

}
