## 🏦 Desafio de Projeto Dio: Criando um Banco Digital com Java e Orientação a Objetos

### 📜 Descrição:

Este `Desafio de Projeto` foi proposto pela `DIO - Digital Innovation One` no `Bootcamp Claro - Java com Spring Boot`.

O objetivo deste projeto prático hands-on é reforçar o conhecimento em `Programação Orientada a Objetos (POO)` em `Java`, explorando seus pilares, através da implementação de um banco digital.
É uma reprodução da solução de referência disposta no diretório https://github.com/falvojr/lab-banco-digital-oo, a qual foi utilizada como base para evoluir a implementação, trazendo melhorias.

Foi acrescentado nova classe, atributos e métodos, simplificando a implementação com Lombok.


### ⏯ Como utilizar:

Neste projeto há o diretório raiz `src` que armazena todas as classes, começando pela classe base `Banco.java`. Essa classe pode adicionar um objeto `Conta` em sua lista de contas e pode exibi-las. Por sua vez a classe `Conta.java` implementa a interface `IConta.java` que define `métodos` para representar as transações bancárias básicas. `Conta.java` é uma `superclasse` que define os `atributos` necessários para a criação de uma conta e implementa os `métodos` propostos pela interface. As contas se dividem em dois tipos `ContaCorrente.java`e `ContaPoupanca.java`, `subclasses` que herdam `Conta.java` e exibem um exemplo de extrato personalizado de acordo com o tipo específico de conta. Há a classe `Cliente.java` com `atributos` representando seus dado pessoais e a classe `Transacao.java` para capturar os dados de uma transação no momento em que for realizada.

Na classe principal `Main.java` deve-se instanciar um objeto da classe `Banco.java` e em seguida instanciar um objeto da classe `Cliente.java` para que seja possível instanciar um objeto da classe `Conta.java`, passando o cliente, o tipo da conta e o banco como argumentos para o construtor da `subclasse` do tipo de conta que deseje criar. Com a conta criada é possível testar suas transações.


### 🛠 Tecnologias utilizadas:
<div>
    <img align="center" alt="ssperandio-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" />
    <img align="center" alt="ssperandio-Git" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original.svg" />
    <img align="center" alt="ssperandio-GitHub" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/github/github-original.svg" />    
</div>


### 📫 Entre em contato comigo:
<div>
  <a href="https://www.linkedin.com/in/sidneysperandio" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
  <a href = "mailto:dev.ssperandio@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://wa.me/5511975018322" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-WhatsApp-%2325D366?style=for-the-badge&logo=whatsapp&logoColor=white" alt="WhatsApp"></a>
</div>


### 🤝 Contribua:
Sinta-se a vontade para somar com a sua contribuição, basta dar um `fork`.

⭐️ Dê um `star` no projeto.

🐛 Abra uma `issues` para relatar algum problema.