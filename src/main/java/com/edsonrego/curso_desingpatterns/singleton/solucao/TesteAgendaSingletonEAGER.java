package com.edsonrego.curso_desingpatterns.singleton.solucao;

public class TesteAgendaSingletonEAGER {
    public static void main(String[] args) {

        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda1);
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda2);

        reservarDiaEAGER("Sexta");
            reservarDiaEAGER("Sábado");
    }

    public static void reservarDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
