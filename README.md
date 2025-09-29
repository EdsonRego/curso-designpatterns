# Curso Design Patterns

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9-green)](https://maven.apache.org/)
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen)](#)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

Este repositório contém exemplos práticos de padrões de projeto em Java, com foco nos padrões **Adapter**, **Builder**, **Factory Method**, **Prototype**, **Proxy**, **Singleton** e **Strategy**.

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

---

## Padrão Prototype

O **Prototype** é um padrão de criação que permite **clonar objetos existentes** sem acoplar o código às suas classes.  
É útil quando a criação de um objeto é **custosa ou complexa**, mas pode ser facilmente copiada.

A ideia central é delegar a criação de novos objetos a uma operação de **cópia** definida na própria classe, em vez de usar `new`.

### Características
- Define uma **interface Prototype** com método de clonagem.
- Classes concretas implementam a clonagem (shallow ou deep copy).
- O cliente cria novos objetos chamando `clone()`, sem depender das classes concretas.

### Casos de uso
- Criação de objetos complexos com muitas configurações.
- Objetos que precisam ser duplicados em tempo de execução.
- Situações em que instanciar via `new` é caro em termos de performance.

### Vantagens
- Reduz o acoplamento entre cliente e classes concretas.
- Facilita a criação de objetos complexos ou pesados.
- Pode ser mais eficiente do que instanciar do zero.

### Desvantagens
- A clonagem profunda pode ser difícil de implementar corretamente.
- Pode exigir atenção extra para evitar cópias incorretas de referências.

**Pacote:** [`prototype`](./src/main/java/com/edsonrego/curso_desingpatterns/prototype)


---

## Padrão Proxy

O **Proxy** é um padrão estrutural que fornece um **substituto ou representante** para outro objeto.  
Ele controla o acesso ao objeto real, permitindo adicionar comportamentos extras sem modificar diretamente a classe original.

A ideia central é que o proxy implementa a mesma interface que o objeto real, mas intercepta as chamadas e pode executar lógica antes/depois de delegar ao objeto.

### Características
- Define uma **interface comum** para o objeto real e o proxy.
- O **proxy** mantém uma referência ao objeto real e redireciona chamadas.
- Pode adicionar responsabilidades como **segurança, cache, logs ou controle de acesso**.

### Tipos comuns de Proxy
- **Virtual Proxy**: cria ou carrega objetos pesados sob demanda.
- **Remote Proxy**: controla acesso a objetos em outra JVM ou servidor.
- **Protection Proxy**: adiciona restrições de acesso com base em permissões.
- **Cache Proxy**: armazena resultados para evitar processamento repetitivo.
- **Logging Proxy**: adiciona rastreamento ou auditoria.

### Casos de uso
- Controle de acesso a dados sensíveis (ex.: autorização).
- Criação preguiçosa (lazy loading) de objetos custosos.
- Interceptação de chamadas para adicionar logs.
- Comunicação entre sistemas distribuídos.

### Vantagens
- Desacopla o cliente de detalhes complexos do objeto real.
- Permite adicionar funcionalidades **sem alterar a classe original**.
- Facilita a implementação de boas práticas como caching e segurança.

### Desvantagens
- Aumenta a complexidade estrutural do sistema.
- Pode impactar a performance se mal implementado (ex.: proxies em cadeia).
- O cliente pode não perceber que está acessando um proxy, dificultando debugging.

**Pacote:** [`proxy`](./src/main/java/com/edsonrego/curso_desingpatterns/proxy)

## Adapter

O **padrão Adapter** é um padrão de design estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como um "tradutor" entre duas classes, convertendo a interface de uma classe em outra esperada pelos clientes.

### Características principais
- Conecta classes com interfaces incompatíveis sem modificá-las.
- Promove **reuso de código** ao integrar componentes existentes em novos contextos.
- É frequentemente usado para integrar **bibliotecas de terceiros** a sistemas já existentes.

### Exemplo do mundo real
Um adaptador de tomada que permite conectar um plugue de três pinos em uma tomada de dois pinos. O plugue não muda e a tomada também não, mas o adaptador faz a ligação entre eles.

### Quando usar
- Quando você quer usar uma classe existente, mas sua interface não corresponde à que o sistema espera.
- Para integrar sistemas legados com novos sistemas.
- Para reutilizar código de terceiros sem alterá-lo.

### Vantagens
- Permite que classes incompatíveis colaborem.
- Promove reutilização de código legado ou de terceiros.
- Ajuda a seguir o princípio **Aberto/Fechado** (Open/Closed Principle).

### Desvantagens
- Pode aumentar a complexidade do sistema se muitos adapters forem criados.
- O excesso de adaptação pode indicar que o design do sistema precisa ser revisado.

### Estrutura simplificada
- **Target**: Define a interface esperada pelo cliente.
- **Adapter**: Implementa a interface `Target` e traduz chamadas para o `Adaptee`.
- **Adaptee**: Classe existente com uma interface incompatível.
- **Client**: Utiliza a interface `Target` sem conhecer os detalhes de adaptação.

### Pacote no projeto

## Strategy

O **padrão Strategy** é um padrão de design comportamental que permite definir uma família de algoritmos, encapsulá-los em classes separadas e torná-los intercambiáveis em tempo de execução. Ele delega a responsabilidade de uma operação para diferentes estratégias, evitando condicionais extensas.

### Características principais
- Separa o algoritmo da lógica de negócio principal.
- Facilita a adição de novos comportamentos sem modificar código existente.
- Elimina o uso excessivo de `if/else` ou `switch`.

### Exemplo do mundo real
Um sistema de pagamento onde o cliente pode escolher pagar com cartão de crédito, PayPal ou Pix. Cada método de pagamento segue regras próprias, mas a interface para o cliente permanece a mesma.

### Quando usar
- Quando uma classe possui vários comportamentos possíveis que podem ser escolhidos em tempo de execução.
- Para eliminar blocos de decisão complexos (`if/else`).
- Quando você deseja respeitar o princípio **Aberto/Fechado** (Open/Closed Principle).

### Vantagens
- Aumenta a flexibilidade do sistema.
- Torna o código mais legível e fácil de manter.
- Facilita a inclusão de novos algoritmos sem alterar código existente.
- Promove a **cohesão** (cada classe tem uma única responsabilidade).

### Desvantagens
- Pode aumentar o número de classes no sistema.
- A escolha da estratégia correta deve ser gerenciada pelo cliente ou por um contexto.

### Estrutura simplificada
- **Strategy**: Interface comum para todas as estratégias.
- **ConcreteStrategy**: Implementações específicas do algoritmo.
- **Context**: Define qual estratégia será utilizada.
- **Client**: Configura o contexto com a estratégia desejada.

### Pacote no projeto
`src/main/java/com/seuprojeto/padroes/comportamentais/strategy`


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