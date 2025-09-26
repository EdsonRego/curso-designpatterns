# Curso Design Patterns

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9-green)](https://maven.apache.org/)
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen)](#)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

Este repositório contém exemplos práticos de padrões de projeto em Java, com foco nos padrões **Singleton**, **Builder** e **Factory Method**.

O objetivo é fornecer uma base de estudo para entender conceitos de design de software, estrutura de código e boas práticas.

---

## Estrutura do projeto

O projeto está organizado por pacotes, separando exemplos de **problemas** e **soluções** de cada padrão:

- `singleton` → exemplos de **Singleton Eager** e **Lazy**, incluindo variações thread-safe.
- `builder` → exemplos de objetos complexos sendo construídos passo a passo, com e sem Lombok.
- `factorymethods` → exemplos de **Factory Method**, incluindo produtos e fábricas concretas, com problemas e soluções.

> Cada pacote contém **códigos executáveis**, com classes de teste (`Test*`) que demonstram a aplicação dos padrões.

---

## Padrão Singleton

O **Singleton** garante que **uma classe tenha apenas uma instância** e fornece um **ponto global de acesso**.

### Tipos

1. **Eager (ansioso)**: instância criada assim que a classe é carregada.
    - **Vantagem:** simples, thread-safe.
    - **Desvantagem:** consome memória mesmo se não usada.

2. **Lazy (preguiçoso)**: instância criada somente quando necessária.
    - **Vantagem:** economia de recursos.
    - **Desvantagem:** não thread-safe sem mecanismos adicionais.

### Casos de uso
- Gerenciamento de **conexões de banco de dados**
- Instâncias de **loggers**
- Configurações globais da aplicação

**Pacote:** [`singleton`](./src/main/java/com/edsonrego/curso_desingpatterns/singleton)

---

## Padrão Builder

O **Builder** permite construir objetos complexos **passo a passo**, separando a construção da representação final.

### Características
- Constrói objetos de forma legível e flexível
- Permite encadeamento de métodos (`method chaining`)
- Facilita objetos imutáveis

### Casos de uso
- Objetos com **muitos atributos**, alguns opcionais
- Evita **construtores longos**
- Configurações de **objetos de domínio ou DTOs**

### Vantagens
- Código mais **organizado e legível**
- Reduz erros de inicialização de atributos

### Desvantagens
- Mais classes e boilerplate (Lombok ajuda)

**Pacote:** [`builder`](./src/main/java/com/edsonrego/curso_desingpatterns/builder)

---

## Padrão Factory Method

O **Factory Method** define uma **interface para criar objetos**, permitindo que **subclasses escolham qual classe concreta instanciar**.

### Características
- Desacopla código cliente da implementação concreta
- Facilita extensão adicionando novos tipos de produtos

### Casos de uso
- Criação de **famílias de objetos relacionados**
- Frameworks extensíveis
- Tipos de objetos definidos em tempo de execução

### Vantagens
- Código cliente independente das classes concretas
- Facilita manutenção e extensão

### Desvantagens
- Aumenta o número de classes
- Requer planejamento da hierarquia

**Pacote:** [`factorymethods`](./src/main/java/com/edsonrego/curso_desingpatterns/factorymethods)

---

## Como compilar e executar

O projeto utiliza **Java 17** e **Maven**.

### 1. Clonar o repositório


git clone https://github.com/SEU_USUARIO/curso-designpatterns.git
cd curso-designpatterns

### 2. Compilar o projeto
mvn clean compile

### 3. Rodar testes (se existirem)
mvn test

### 4. Executar a aplicação principal (se houver classe main)
mvn exec:java -Dexec.mainClass="com.edsonrego.curso_desingpatterns.MainClass"


Substitua MainClass pela classe que contém o método main que deseja executar.

Observações gerais

Os padrões podem ser combinados em projetos reais para modularidade e reutilização.

Este repositório contém exemplos de problemas e soluções para cada padrão.

Estudar e executar os exemplos ajuda a escrever código limpo, flexível e fácil de manter.

```bash