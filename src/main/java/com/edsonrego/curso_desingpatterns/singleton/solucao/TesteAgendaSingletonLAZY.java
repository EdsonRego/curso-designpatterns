package com.edsonrego.curso_desingpatterns.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingletonLAZY {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda2);

        reservarDiaLAZY("Sexta");
        reservarDiaLAZY("Sábado");

        System.out.println();

        //Código REFLECTION,
        //Este ´codigo é "Malandrao" pois com ele, é possivel burlar o singleton e gerar mais de uma instância do objeto.
        //para impedir isso, deve-se usar ENUMs
        Constructor<AgendaSingletonLAZY> construtorMalandro = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorMalandro.setAccessible(true);
        AgendaSingletonLAZY agendaMalandra1 = construtorMalandro.newInstance();
        AgendaSingletonLAZY agendaMalandra2 = construtorMalandro.newInstance();
        System.out.println(agendaMalandra1);
        System.out.println(agendaMalandra2);

    }

    public static void reservarDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
