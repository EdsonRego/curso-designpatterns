package com.edsonrego.curso_desingpatterns.bulder.solucao;

public class TesteAnimal {

    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .nome("Dallas")
                .dono("Edson")
                .raca("do bem")
                .build();

        System.out.println(animal);
    }
}
