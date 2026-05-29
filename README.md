# 🥐 Sistema de Padaria

Sistema de gerenciamento para padaria desenvolvido em Java, com foco em Programação Orientada a Objetos (POO). O sistema permite o cadastro e gerenciamento de clientes, funcionários e produtos, além de realizar pedidos com cálculo automático do total.

---

## 📋 Descrição do Projeto

O Sistema de Padaria simula o funcionamento básico de uma padaria, permitindo:

- Cadastrar e listar **clientes**
- Cadastrar e listar **funcionários** (com validação de idade)
- Cadastrar e listar **produtos**
- Realizar **pedidos** com seleção de produtos e cálculo do total

O sistema funciona via terminal (linha de comando), com um menu interativo e navegação por números.

---

## 🗂️ Estrutura do Projeto

```
📁 Sistema-Padaria/
├── Pessoa.java
├── Cliente.java
├── Funcionario.java
├── Produto.java
└── Padaria.java
```

---

## 🧱 Classes e Responsabilidades

### `Pessoa` — Classe Base
Classe pai que representa qualquer pessoa do sistema.

| Atributo | Tipo   | Descrição        |
|----------|--------|------------------|
| nome     | String | Nome da pessoa   |
| idade    | int    | Idade da pessoa  |

---

### `Cliente` — Herda de `Pessoa`
Representa um cliente da padaria.

| Atributo  | Tipo   | Descrição              |
|-----------|--------|------------------------|
| endereco  | String | Endereço do cliente    |
| telefone  | String | Telefone de contato    |

**Método:** `mostrarCliente()` — exibe todos os dados do cliente.

---

### `Funcionario` — Herda de `Pessoa`
Representa um funcionário da padaria.

| Atributo | Tipo   | Descrição               |
|----------|--------|-------------------------|
| cargo    | String | Cargo do funcionário    |
| salario  | double | Salário do funcionário  |

**Método:** `mostrarFuncionario()` — exibe todos os dados do funcionário.

> ⚠️ Validação: só são aceitos funcionários com idade entre 18 e 70 anos.

---

### `Produto`
Representa um produto disponível na padaria.

| Atributo | Tipo   | Descrição           |
|----------|--------|---------------------|
| nome     | String | Nome do produto     |
| preco    | double | Preço do produto    |

**Método:** `mostrarProduto()` — exibe nome e preço do produto.

---

### `Padaria` — Classe Principal
Contém o método `main`. Responsável pelo menu interativo e pelo fluxo principal do sistema.

**Funcionalidades do menu:**

| Opção | Função                  |
|-------|-------------------------|
| 1     | Cadastrar Cliente       |
| 2     | Cadastrar Funcionário   |
| 3     | Cadastrar Produto       |
| 4     | Listar Clientes         |
| 5     | Listar Funcionários     |
| 6     | Listar Produtos         |
| 7     | Fazer Pedido            |
| 0     | Sair                    |

---

## 🧩 Conceitos de POO Utilizados

### ✅ Classes e Objetos
Cada entidade do sistema (Cliente, Funcionário, Produto) é representada por uma classe, e os dados são armazenados como objetos instanciados em tempo de execução.

### ✅ Atributos e Métodos
Cada classe possui seus próprios atributos (dados) e métodos (comportamentos), como `mostrarCliente()`, `mostrarFuncionario()` e `mostrarProduto()`.

### ✅ Encapsulamento
Os atributos das classes são acessados por meio de construtores, agrupando os dados e comportamentos de cada entidade em sua respectiva classe.

### ✅ Herança
`Cliente` e `Funcionario` herdam da classe `Pessoa`, reutilizando os atributos `nome` e `idade` sem repetição de código. A palavra-chave `super` é usada para chamar o construtor da classe pai.

```
Pessoa
├── Cliente
└── Funcionario
```

---

## ▶️ Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal (CMD, PowerShell, Git Bash ou similar)

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/sistema-padaria.git
cd sistema-padaria
```

2. Compile os arquivos:
```bash
javac *.java
```

3. Execute o programa:
```bash
java Padaria
```

---

## 💡 Exemplo de Uso

```
===== PADARIA =====
1 - Cadastrar Cliente
2 - Cadastrar Funcionario
3 - Cadastrar Produtos
4 - Ver Clientes
5 - Ver Funcionarios
6 - Ver Produto
7 - Fazer pedidos
0 - Sair

> 1
Nome: Maria Silva
Idade: 35
Endereco: Rua das Flores, 123
Telefone: (84) 99999-0000
Cliente cadastrado!
```

---

## 👥 Integrantes do Grupo

| Nome | RA |
|------|----|
|      |    |
|      |    |
|      |    |
|      |    |
|      |    |
|      |    |

---

## 🏫 Informações Acadêmicas

- **Disciplina:** Lógica de Programação com POO
- **Projeto:** A3
- **Entrega:** Junho de 2026
- **Linguagem:** Java
