# Formulários de Cadastro e Login - Salesforce

Construção inicial do backend para as páginas:  “Login”, “Teste Grátis” e “Entre em Contato”, com foco na experiência do usuário e validação dos dados de entrada.

# Informações Gerais

- **IDE:**  [Eclipse](https://www.eclipse.org/downloads/)
- **Linguagem:** [Java](https://www.java.com/pt-BR/)
- **Pacote:** [javax.swing.JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)

# UML: **Diagrama de Classes**

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled.png)

# **Objetivo do Projeto**

O principal objetivo deste projeto é aprimorar a experiência do usuário ao interagir com os formulários de cadastro, login e contato na plataforma Salesforce. Pretendemos aperfeiçoar a lógica de validação de dados inseridos durante o processo de registro, assegurando maior eficiência na coleta e processamento das informações.

# **Mudanças Propostas:**

1. **Formulários de Cadastro (Teste Grátis) e Login:**
    - Refazer os formulários de cadastro e login, utilizando métodos que validem as informações;
    - Tornar alguns campos não obrigatórios para preenchimento (como nos campos de sobrenome e nome da empresa), pensando na experiência do usuário e informações mínimas necessárias;
    - Aprimorar a validação dos dados para evitar erros e garantir que as informações fornecidas sejam precisas.
2. **Formulário de Contato com Especialistas (Entre em Contato):**
    - Reformular o formulário de contato com especialistas, simplificando-o para uma experiência mais eficiente.
    - Reduzir as informações solicitadas ao usuário, pedindo apenas os dados essenciais, como nome, e-mail e telefone.
    - Eliminar a redundância de informações entre o formulário de contato e a página de teste grátis, tornando o processo mais direto.
    - Priorizar a agilidade e a praticidade no contato direto com especialistas, minimizando o risco de desistências devido a experiências demoradas.

# **Benefícios Esperados:**

- Melhorar a usabilidade da plataforma Salesforce, tornando-a mais amigável e eficiente para os usuários.
- Reduzir a complexidade dos formulários, tornando o processo de cadastro, login e contato mais rápido e direto.
- Minimizar erros de entrada de dados por meio de validações aprimoradas.
- Aumentar a taxa de conversão e engajamento dos usuários devido à experiência simplificada e mais eficiente.

Este projeto tem como foco central aprimorar a experiência do usuário, simplificando os processos de interação com a plataforma Salesforce e tornando-os mais eficazes.

---

# **Funcionalidades**

→ A seguir, apresentaremos os detalhes da execução das funcionalidades implementadas no projeto, acompanhados por demonstrações visuais dos resultados práticos que foram alcançados.

- Informa-se abaixo o retorno padrão de cada método de validação quando se cancela todas as entradas de dados declaradas na caixa de diálogo do JOptionPane:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%201.png)

- Após a execução do sistema, a primeira caixa de diálogo será referente à página de “Login” no qual pedirá que digite o e-mail do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%202.png)

- Se o usuário clicar em “OK” sem nenhum conteúdo dentro da caixa de diálogo, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%203.png)

- Além disso, se for digitado o e-mail com um formato que não obedeça sua expressão regular (RegEx), será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%204.png)

***Obs.:** Essa configuração para a validação do e-mail se repete para as páginas “Teste Grátis” e “Entre em Contato”.

- A segunda caixa de diálogo também será referente à página de login no qual pedirá que digite a senha do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%205.png)

- Se for digitada a senha com um formato que não obedeça a quantidade mínima de caracteres, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%206.png)

→ As caixas de diálogos a seguir serão referentes à página “Teste Grátis”.

- A caixa de diálogo abaixo pedirá que digite o nome do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%207.png)

***Obs.:** Essa configuração para a validação do nome se repete para a página “Entre em Contato”.

- Se o usuário clicar em “OK” sem nenhum conteúdo dentro da caixa de diálogo, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%208.png)

- A caixa de diálogo abaixo pedirá que digite o sobrenome do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%209.png)

- Porém, diferente das caixas de diálogos anteriores, o sobrenome não é obrigatório e pode ter uma entrada vazia. Sendo assim, se o usuário deixar o campo vazio, seguirá para a próxima caixa de diálogo.

***Obs.:** Essa configuração para a validação do sobrenome se repete para a caixa de diálogo que pede o nome da empresa.

- A caixa de diálogo abaixo pedirá que digite o porte da empresa do usuário (a entrada do usuário irá passar por condicionais que retornará o porte de acordo com uma quantidade pré-definida):

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2010.png)

- A caixa de diálogo abaixo pedirá que digite o país do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2011.png)

- Se o usuário clicar em “OK” sem nenhum conteúdo dentro da caixa de diálogo, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2012.png)

- A caixa de diálogo abaixo pedirá que digite o idioma do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2013.png)

- Se o usuário clicar em “OK” sem nenhum conteúdo dentro da caixa de diálogo, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2014.png)

→ As caixas de diálogos a seguir serão referentes às informações de contato (código do país, DDD e número de telefone) da página “Teste Grátis”.

- A caixa de diálogo abaixo pedirá que digite o código do país do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2015.png)

- Se o usuário digitar o código do país fora do intervalo de 1 a 999, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2016.png)

- A caixa de diálogo abaixo pedirá que digite o DDD do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2017.png)

- Se o usuário digitar o DDD e não possuir três dígitos numéricos, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2018.png)

- A caixa de diálogo abaixo pedirá que digite o número do usuário:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2019.png)

- Se o usuário digitar o número e não possuir oito dígitos numéricos, será emitida a seguinte mensagem:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2020.png)

***Obs.:** Essa configuração para a validação do telefone se repete para a página “Entre em Contato”.

- Informa-se abaixo o retorno de cada método de validação quando se preenche corretamente todas as entradas de dados declaradas na caixa de diálogo do JOptionPane:

![Untitled](Java%2068f113e462f74c1396d2ea3f0f1b66c2/Untitled%2021.png)

# Referências

[https://www.devmedia.com.br/programacao-orientada-a-objetos-com-java/18449](https://www.devmedia.com.br/programacao-orientada-a-objetos-com-java/18449)

[https://www.alura.com.br/apostila-java-orientacao-objetos/pacotes-organizando-suas-classes-e-bibliotecas](https://www.alura.com.br/apostila-java-orientacao-objetos/pacotes-organizando-suas-classes-e-bibliotecas)

[https://m.uniara.com.br/arquivos/file/cca/artigos/2016/joao-mateus-moreto.pdf](https://m.uniara.com.br/arquivos/file/cca/artigos/2016/joao-mateus-moreto.pdf)