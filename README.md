# MyGameMachine

### Requisitos Funcionais:

1. **Iniciar o Jogo:**
   - O jogo deve iniciar com uma mensagem de boas-vindas e instruções breves sobre como jogar.

2. **Escolha do Jogador:**
   - O jogador deve ser capaz de escolher entre ser "Par" ou "Ímpar" digitando sua escolha no terminal.
   - O jogador deve inserir um número inteiro entre 0 e 10 como sua jogada.

3. **Jogada do Computador:**
   - O computador gera automaticamente um número inteiro aleatório entre 0 e 10.

4. **Determinação do Vencedor:**
   - O jogo calcula a soma dos números escolhidos.
   - O jogo determina se a soma é par ou ímpar.
   - Baseado na escolha inicial do jogador (par ou ímpar), o jogo declara o vencedor.

5. **Resultado:**
   - O jogo exibe o número escolhido pelo jogador, o número gerado pelo computador, a soma dos dois, e declara o vencedor.

6. **Repetir ou Encerrar:**
   - Após mostrar o resultado, o jogo deve perguntar se o jogador deseja jogar novamente ou encerrar o jogo.

### Requisitos Não Funcionais:

1. **Usabilidade:**
   - As interações no terminal devem ser claras e simples, garantindo que o jogador entenda facilmente como fazer suas escolhas.

2. **Desempenho:**
   - O jogo deve executar comandos e calcular resultados rapidamente, mantendo tempos de resposta curtos para uma boa experiência de usuário.

3. **Portabilidade:**
   - Desenvolvido em Java para garantir que o jogo possa ser executado em diferentes sistemas operacionais que suportem a JVM.

### Requisitos de Interface:

1. **Interface de Linha de Comando (CLI):**
   - O jogo será inteiramente jogado através do terminal ou prompt de comando, utilizando texto para todas as interações.

2. **Mensagens de Feedback:**
   - O jogo deve fornecer feedback claro e imediato após cada ação do jogador, incluindo instruções, resultados da jogada, e opções para jogar novamente ou sair.

### Requisitos de Desenvolvimento:

1. **Ferramentas:**
   - O desenvolvimento deve ser feito utilizando uma IDE suportada para Java, como Eclipse, IntelliJ IDEA, ou VS Code com suporte para Java.

2. **Controle de Versão:**
   - O código-fonte deve ser gerenciado com um sistema de controle de versão, como Git, facilitando revisões e contribuições.

### Exemplo de Como o Jogo Pode Funcionar no Terminal:

```plaintext
Bem-vindo ao Jogo Par ou Ímpar!
Instruções: Você escolherá ser Par ou Ímpar e em seguida escolherá um número de 0 a 10.
O computador também escolherá um número de 0 a 10. Se a soma dos dois números for par e você escolheu Par, você ganha! E vice-versa.

Você quer ser Par ou Ímpar? [Par/Ímpar]:
Digite seu número (0 a 10):

Número do jogador: 4
Número do computador: 3
Soma: 7
Ímpar vence! Você perdeu.

Jogar novamente? [sim/não]:
```



