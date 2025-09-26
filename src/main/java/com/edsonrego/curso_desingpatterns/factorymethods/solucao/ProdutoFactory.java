package com.edsonrego.curso_desingpatterns.factorymethods.solucao;

import com.edsonrego.curso_desingpatterns.factorymethods.Produto;
import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoDigital;
import com.edsonrego.curso_desingpatterns.factorymethods.ProdutoFisico;
import com.edsonrego.curso_desingpatterns.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {

    /**
     * O Factory Method é um padrão criacional que define uma interface para criar objetos, mas permite que as subclasses decidam qual classe concreta instanciar.
     Útil quando você quer desacoplar a criação de objetos do seu código principal.
     Permite adicionar novos tipos de produtos sem modificar o código que os utiliza.

     Estrutura do padrão Factory
     Produto (Product) → interface ou classe abstrata que define o tipo do objeto.
     Produto Concreto (ConcreteProduct) → classes que implementam o produto.
     Fábrica (Creator / Factory) → interface ou classe abstrata com o método factoryMethod().
     Fábrica Concreta (ConcreteCreator) → subclasses que implementam factoryMethod() e retornam produtos concretos.

     Característica	    Factory Method
     Tipo de padrão	    Criacional
     Responsabilidade   Criação de objetos através de um método abstrato/fábrica
     Vantagem	        Desacopla código cliente da implementação concreta
     Desvantagem	    Pode aumentar o número de classes
     Uso comum	Bibliotecas, frameworks, objetos polimórficos

     */

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum){

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }

    }
}
