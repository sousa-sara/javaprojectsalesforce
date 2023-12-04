# Formulários de Cadastro - Salesforce

O projeto é um programa de console para cadastro e listagem das páginas "Entre em Contato" e "Teste Grátis" da empresa Salesforce, utilizando a linguagem de programação Java.

## Informações Gerais

- *IDE:*  [Eclipse](https://www.eclipse.org/downloads/)
- *Linguagem:* [Java](https://www.java.com/pt-BR/)
- *Biblioteca:* [javax.swing.JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)

## UML: *Diagrama de Classes*


<div align="center">
    <img  width="508px" src="./ImagensReadme/img (1).png" />
</div>


## *Objetivo do Projeto*

O objetivo do projeto é criar um programa simples de console em Java para gerenciar o cadastro e a listagem de "Entre em Contato" e "Teste Grátis". O programa visa oferecer uma interface interativa ao usuário por meio de caixas de diálogo, utilizando a biblioteca Swing (JOptionPane).

## Funcionalidades

O programa utiliza a biblioteca Swing para criar caixas de diálogo interativas e oferece um menu com as seguintes opções:

1. Cadastro: Entre Em Contato - Permite ao usuário cadastrar novos usuários de entre em contato, solicitando informações como nome, e-mail e telefone.

2. Cadastro: Teste Grátis - Permite ao usuário cadastrar novos usuários de teste grátis, solicitando informações como nome, sobrenome, e-mail, telefone, nome da empresa, porte da empresa, país e idioma.

3. Listar: Entre Em Contato - Exibe uma lista com informações de todos os usuários de entre em contato cadastrados, incluindo ID, nome, e-mail e telefone.

4. Listar: Teste Grátis - Exibe uma lista com informações de todos os usuários de teste grátis cadastrados, incluindo ID, nome, sobrenome, e-mail, telefone, nome da empresa, porte da empresa, país e idioma.

5. Sair: Encerra o programa.

## Fluxo de Uso no Console

Vamos seguir um exemplo de interação com o programa, mostrando como um usuário pode utilizar as opções disponíveis no menu.

*Cadastro: Entre Em Contato*

- Insira o nome do contato, por exemplo, "João da Silva".
- Insira o e-mail do contato, por exemplo, "joao.silva@email.com".
- Insira o código do país do telefone, DDD e número, por exemplo, 55, 11 e 987654321.
- Uma mensagem de confirmação será exibida: "Usuário cadastrado com sucesso!"

*Cadastro: Teste Grátis*

- Insira o nome do usuário, por exemplo, "Maria".
- Insira o sobrenome do usuário, por exemplo, "Souza".
- Insira o e-mail do usuário, por exemplo, "maria.souza@email.com".
- Insira o código do país do telefone, DDD e número, por exemplo, 55, 21 e 987654321.
- Insira o nome da empresa, por exemplo, "ABC Ltda".
- Insira o porte da empresa (um número), por exemplo, 3 (pequena empresa).
- Insira o país da empresa, por exemplo, "Brasil".
- Insira o idioma do usuário, por exemplo, "Português".
- Uma mensagem de confirmação será exibida: "Usuário cadastrado com sucesso!"

*Listar: Entre Em Contato*

- Uma caixa de diálogo exibirá informações sobre os contatos, incluindo ID, nome, e-mail e telefone.

*Listar: Teste Grátis*

- Uma caixa de diálogo exibirá informações sobre os usuários de teste grátis, incluindo ID, nome, sobrenome, e-mail, telefone, nome da empresa, porte da empresa, país e idioma.

*Sair*

- Uma mensagem será exibida: "Saindo do programa."

## Desenvolvedores

Débora Costa

Leonardo de Oliveira

Sara Sousa

## Referências

https://www.alura.com.br/conteudo/java-listas-colecoes-dados
https://www.feg.unesp.br/Home/PaginasPessoais/CristovaoCunha/TreinamentoSGCD/matelli/como-usar-arraylist-em-java.pdf
