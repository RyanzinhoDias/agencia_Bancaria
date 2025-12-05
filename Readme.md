🏦 Projeto Banco em Java

Este projeto é um pequeno sistema bancário feito em Java.
Com ele você pode criar contas, sacar, depositar, transferir dinheiro e visualizar os dados das contas cadastradas.

É um projeto simples, mas muito útil para praticar orientação a objetos, herança e organização de classes.

🚀 O que dá pra fazer com o sistema?

- Criar conta corrente ou conta poupança;

- Depositar em uma conta;

- Sacar dinheiro;

- Transferir valores entre contas;

Tudo feito direto no terminal, num menu interativo.

🧠 Conceitos de programação usados

Esse projeto aplica vários tópicos importantes de Java:

- POO (Programação Orientada a Objetos)

- Herança:

- Conta → classe base

- ContaCorrente e ContaPoupanca → especializações

- Encapsulamento

- Separação de responsabilidades

- Leitura de dados pelo terminal

- Coleções para guardar contas

📁 Estrutura do projeto
├── Banco.java          # Guarda e gerencia as contas
├── Conta.java          # Classe base de todas as contas
├── ContaCorrente.java  # Tipo de conta 1
├── ContaPoupanca.java  # Tipo de conta 2
├── Operacoes.java      # Onde ficam as ações do menu
├── Leitura.java        # Leitura de dados pelo terminal
└── Main.java           # Ponto de entrada do sistema

▶️ Como executar o projeto

Você só precisa do Java instalado na máquina.

1. Compile tudo:
   javac *.java

2. Rode o programa:
   java Main


O menu já vai aparecer pedindo as opções.

📌 Ideia geral sobre o funcionamento

- O programa começa na Main, que chama as operações.

- A classe Operacoes cuida do menu e do fluxo do sistema.

- O Banco é como se fosse o “banco de dados”: ele guarda e busca as contas.

- A classe Conta tem os atributos e métodos básicos.

- ContaCorrente e ContaPoupanca herdam tudo e podem ter comportamentos próprios.
