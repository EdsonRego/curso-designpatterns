package com.edsonrego.curso_desingpatterns.singleton.problema;

public class TesteAgenda {
    public static void main(String[] args) {
            reservarDia("Sexta");
            reservarDia("Sábado");
    }

    public static void reservarDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
