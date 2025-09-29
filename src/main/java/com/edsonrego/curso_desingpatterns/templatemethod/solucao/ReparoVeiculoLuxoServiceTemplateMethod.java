package com.edsonrego.curso_desingpatterns.templatemethod.solucao;

import com.edsonrego.curso_desingpatterns.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoLuxoServiceTemplateMethod extends ReparoVeiculoService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoLuxoServiceTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
