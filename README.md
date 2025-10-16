# 🚗 Sistema de Gestão de Concessionária de Carros

> Projeto desenvolvido em **Java** como atividade avaliativa da disciplina de **Programação Orientada a Objetos** (POO).

## 📋 Descrição

Sistema desktop para gerenciamento completo de uma concessionária de carros. Permite cadastro, consulta e realização de vendas de diferentes tipos de veículos, com controle de clientes e vendedores.

O projeto aplica **conceitos fundamentais de POO** como herança, polimorfismo, encapsulamento, interfaces e tratamento de exceções customizadas.

## ✨ Funcionalidades

- ✅ **Cadastro de Carros:** Esportivo, Luxo e Elétrico
- ✅ **Gestão de Clientes:** Inclusão de clientes comuns e premium
- ✅ **Gestão de Vendedores:** Registro com comissão e acompanhamento de vendas
- ✅ **Realização de Vendas:** Com desconto e cálculo de preço personalizado por tipo
- ✅ **Relatórios:** Consulta de carros disponíveis, clientes, vendedores e histórico de vendas
- ✅ **Menu Interativo:** Interface via linha de comando com navegação por opções

## 🏗️ Arquitetura e Conceitos POO

### Herança
- Classe abstrata `Pessoa` com subclasses `Cliente` e `Vendedor`
- Classe abstrata `Carro` com subclasses especializadas:
  - `CarroEsportivo` (velocidade máxima, turbo)
  - `CarroLuxo` (revestimento couro, som premium)
  - `CarroEletrico` (autonomia, tempo de recarga)

### Polimorfismo
- **Sobrescrita:** Métodos `calcularPrecoVenda()` e `exibirDetalhes()` em cada tipo de carro
- **Sobrecarga:** Método `vender()` com e sem parâmetro de desconto

### Encapsulamento
- Todos os atributos são `private`
- Acesso controlado via `getters` e `setters` públicos

### Interface
- Interface `Vendavel` implementada pela classe `Carro`
- Define contrato para cálculo de preço e exibição de detalhes

### Reflexividade
- Navegação entre objetos: `cliente.getEndereco().setRua("...")`
- Classe `Endereco` para melhor estruturação de dados

### Tratamento de Exceções
- Exceção customizada `CarroJaVendidoException`
- Exceção customizada `EstoqueInsuficienteException`
- Blocos `try-catch` em operações críticas

### Separação de Responsabilidades
- **Classes Entidades:** Armazenam dados (atributos + getters/setters)
- **Classes Controle:** Gerenciam entrada/saída de dados
- **Classe Principal:** Orquestra o sistema com menu interativo

## 📁 Estrutura do Projeto

```
src/
├── Pessoa.java (abstrata)
├── Cliente.java
├── Vendedor.java
├── Endereco.java
├── Carro.java (abstrata)
├── CarroEsportivo.java
├── CarroLuxo.java
├── CarroEletrico.java
├── Vendavel.java (interface)
├── Venda.java
├── Concessionaria.java
├── CarroJaVendidoException.java
├── EstoqueInsuficienteException.java
├── ControleCarro.java
├── ControlePessoa.java
├── ControleVenda.java
└── Principal.java (main)
```

## 🛠️ Tecnologias

- **Linguagem:** Java 8+
- **Paradigma:** Programação Orientada a Objetos
- **Interface:** Console (CLI)
- **Ferramentas:** Astah UML (diagramação)

## 🚀 Como Usar

1. **Compilar:**
   ```bash
   javac *.java
   ```

2. **Executar:**
   ```bash
   java Principal
   ```

3. **Menu Principal:**
   - Cadastro de dados (carros, clientes, vendedores)
   - Realizar vendas
   - Consultar relatórios
   - Demonstração de reflexividade
   - Sair

## 📊 Diagrama de Classes

O projeto utiliza um diagrama UML completo documentando:
- Relacionamentos de herança
- Implementação de interfaces
- Reflexividade entre objetos
- Associações entre classes

## 👨‍💻 Autor

**João Pedro Aleksandrov Lorenzetti**

Estudante de Engenharia de Software - 3º Semestre

## 📚 Conceitos Aplicados

- ✅ Herança (3 classes filhas)
- ✅ Polimorfismo (sobrecarga e sobrescrita)
- ✅ Encapsulamento (modificadores de acesso)
- ✅ Interface (contrato de métodos)
- ✅ Reflexividade (navegação entre objetos)
- ✅ Exceções Customizadas
- ✅ Collections (ArrayList)
- ✅ Separação de Responsabilidades

## 📝 Notas

Este projeto foi desenvolvido como atividade de aprendizado em POO, aplicando boas práticas de design e arquitetura de software.
