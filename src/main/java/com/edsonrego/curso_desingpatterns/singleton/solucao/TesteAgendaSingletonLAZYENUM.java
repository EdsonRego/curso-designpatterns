package com.edsonrego.curso_desingpatterns.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingletonLAZYENUM {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        AgendaSingletonLAZYENUM agenda1 = AgendaSingletonLAZYENUM.INSTANCE.getInstance();
        System.out.println(agenda1.hashCode());
        AgendaSingletonLAZYENUM agenda2 = AgendaSingletonLAZYENUM.INSTANCE.getInstance();
        System.out.println(agenda2.hashCode());

        reservarDiaLAZYENUM("Sexta");
        reservarDiaLAZYENUM("Sábado");

        System.out.println();

        //Código REFLECTION,
        //Este ´codigo é "Malandrao" pois com ele, é possivel burlar o singleton e gerar mais de uma instância do objeto.
        //para impedir isso, deve-se usar ENUMs, neste exemplo o código quebra e gera um erro
        Constructor<AgendaSingletonLAZYENUM> construtorMalandro = AgendaSingletonLAZYENUM.class.getDeclaredConstructor();
        construtorMalandro.setAccessible(true);
        AgendaSingletonLAZYENUM agendaMalandra1 = construtorMalandro.newInstance();
        AgendaSingletonLAZYENUM agendaMalandra2 = construtorMalandro.newInstance();
        System.out.println(agendaMalandra1.hashCode());
        System.out.println(agendaMalandra2.hashCode());

    }

    public static void reservarDiaLAZYENUM(String dia){
        AgendaSingletonLAZYENUM agenda = AgendaSingletonLAZYENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
