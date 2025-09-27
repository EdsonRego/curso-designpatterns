package com.edsonrego.curso_desingpatterns.prototype.solucao;

import com.edsonrego.curso_desingpatterns.prototype.Botao;
import com.edsonrego.curso_desingpatterns.prototype.TipoBordaEnum;

public class BotaoFactory {

    public static Botao getInstance(Botao prototipo) {

        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

        return clone;
    }
}
