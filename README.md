# :coffee: Java Programs

## Índice

- [Sobre](##Sobre)
- [Programas](#Programas)
  - [Calcular azulejos](#Calcular-azulejos)
  - [Calcular desconto](#Calcular-desconto)
  - [Calcular velocidade média](#Calcular-velocidade-média)
  - [Caixas de diálogo](#Caixas-de-diálogo)
  - [Comparar números](#Comparar-números)
  - [Jogo de álgebra](#Jogo-de-álgebra)
  - [Jogo de cálculo](#Jogo-de-cálculo)
  - [Jogo de acertar o número](#Jogo-de-acertar-o-número)
  - [Lista de convidados](#Lista-de-convidados)
  - [Lista de convidados PLUS](#Lista-de-convidados-PLUS)
  - [Lista de convidados PLUS 2](#Lista-de-convidados-PLUS-2)
  - [Somar idades acima de 18 anos](#Somar-idades-acima-de-18-anos)
  - [Somar idades](#Somar-idades)
  - [Somar total de uma compra](#Somar-total-de-uma-compra)
  - [Olá mundo](#Olá-mundo)
  - [Criar recibo](#Criar-recibo)
  - [Tabuada](#Tabuada)
  - [Classificar idade](#Classificar-idade)
  - [Triângulo I](#Triângulo-I)
  - [Triângulo II](#Triângulo-II)

<br />

## Sobre

Java Programs é um programa que agrupa e executa os simples exercícios que fiz utilizando Java no começo do meu curso de informática.

<br />

## Programas

### Calcular azulejos

Este programa calcula a quantidade de azulejos necessária para cobrir uma parede. O cálculo é feito utilizando as informações de altura e largura da parede, bem como a dimensão dos azulejos, que devem ser fornecidas.

- Exemplo de saída:

  ```bash
  =====================
  CALCULAR QUANTIDADE DE AZULEJO

  > Informe a altura da parede (m): 36
  > Informe a largura da parede (m): 36
  > Informe a altura do azulejo (m): 3
  > Informe a largura do azulejo (m): 6

  >> A quantidade de azulejos necessária para preencher a parede é: 72,0.
  =====================
  ```

<br />

### Calcular desconto

Este programa calcula o total de uma compra a partir dos preços fornecidos, e o desconto com base nos critérios:

- Compras com total acima R$ 0 e abaixo de R$ 500,00: desconto de 10%
- Compras com total maior ou igual a R$ 500,00 e abaixo de R$ 800,00: desconto de 15%
- Compras com total entre R$ 800,00 e R$ 1000,00: desconto de 20%
- Compras com total acima de R$ 1000,00: desconto de 30%

- Exemplo de saída:

  ```bash
  =====================
  CALCULAR DESCONTO
  Insira qualquer letra ou símbolo para finalizar.

  > Informe o valor do produto: 1200
  > Informe o valor do produto: 762,90
  > Informe o valor do produto: f

  >> O valor total da compra é R$ 1.962,90.
  >> Sua porcentagem de desconto é: 30%.
  >> O valor do desconto é R$ 588,87.
  >> Com isso, o valor a ser pago é R$ 1.374,03.
  =====================
  ```

<br />

### Calcular velocidade média

Este programa calcula a velocidade média de um veículo a partir da distância e do tempo fornecido.

- Exemplo de saída:

  ```bash
  =====================
  CALCULAR VELOCIDADE MÉDIA

  > Insira a distância percorrida (Km): 200
  > Insira o tempo gasto (horas): 10

  >>> Para encontrar a velocidade média dividimos a distância (200.0) pelo tempo gasto no percurso (10.0).

  >> A velocidade média é de 20.0 Km/h.
  =====================
  ```

<br />

### Caixas de diálogo

Este programa mostra três tipos de caixas de diálogo na tela: mensagem, input e confirmação.

<br />

### Comparar números

Este programa compara números fornecidos e mostra no console o menor e o maior dentre todos.

- Exemplo de saída:

  ```bash
  =====================
  COMPARAR NÚMEROS

  > Insira a quantidade de números a serem comparados: 3

  > Insira o 1° número inteiro: 2
  > Insira o 2° número inteiro: 1
  > Insira o 3° número inteiro: 3

  >> O menor número é: 1
  >> O maior número é: 3
  =====================
  ```

<br />

### Jogo de álgebra

Este programa é um jogo cujo objetivo é identificar o valor de "x" na expressão algébrica criada.

- Exemplo de saída:

  ```bash
  =====================
  JOGO DE ÁLGEBRA
   Descubra o valor de X.
   Digite "404" para finalizar o jogo.


  1) 2x * 3 = 48
  > O valor de X é: 8

  >> Parabéns, você acertou!

  2) 5x + 8 = 28
  > O valor de X é: 7

  >> Que pena, a resposta era: 4

  3) 4x - 8 = 20
  > O valor de X é: 404

  >> VITÓRIAS: 1
  >> DERROTAS: 1
  >> TOTAL DE PARTIDAS: 2
  =====================
  ```

<br />

### Jogo de cálculo

Este programa é um jogo cujo objetivo é resolver as contas geradas.

- Exemplo de saída:

  ```bash
  =====================
  JOGO DE CÁLCULO
   Resolva os cálculos que surgirem, mas Atenção: você possui somente 3 chances.
   Insira '404' a qualquer momento para trocar de nível/sair.

  >> Em qual nível deseja jogar?
  1) Nível 1 (soma)
  2) Nível 2 (subtração)
  3) Nível 3 (multiplicação)
  4) Nível 4 (divisão [apenas parte inteira])
  5) Finalizar o jogo

  > 1

  1) 72 + 55 = 127

  >> Parabéns, você acertou!

  2) 1 + 96 = 1

  >> Que pena, a resposta era: 97
  >> VIDAS: 2

  3) 65 + 22 = 2

  >> Que pena, a resposta era: 87
  >> VIDAS: 1

  4) 92 + 34 = 3

  >> Que pena, a resposta era: 126

  >> Suas chances acabaram :(
  >> Deseja continuar jogando? (s/n) n

  >> Partidas: 4
  >> Vitórias: 1
  >> Derrotas: 3

  >> PONTUAÇÃO: 200
  =====================
  ```

<br />

### Jogo de acertar o número

Este programa é um jogo cujo objetivo é acertar o número previamente gerado aleatoriamente. O jogador possui 3 tentativas. A cada tentativa uma dica é fornecida. Ao fim, uma caixa de diálogo informará a vitória ou derrota do jogador.

- Exemplo de saída:

  ```bash
  =====================
  JOGO DE ACERTAR O NÚMERO
   Tente acertar o número de 0 até 9 gerado aleatoriamente.
   ATENÇÃO: Você terá somente 3 chances.


  > Digite um número: 5

  >> Errou T-T, tente novamente.
  >> Atenção: você só tem 2 chances.
  >> Dica: o número digitado é maior que o número a ser adivinhado ;)


  > Digite um número: 3

  >> Errou T-T, tente novamente.
  >> Atenção: você só tem 1 chances.
  >> Dica: o número digitado é menor que o número a ser adivinhado ;)


  > Digite um número: 4

  [nesse momento, uma caixa de diálogo anunciará a vitória/derrota]

  > Deseja continuar? (s/n) n
  =====================
  ```

<br />

### Lista de convidados

Este programa armazena em um vetor o nome de 5 convidados de uma festa e os exibe ao fim.

- Exemplo de saída:

  ```bash
  =====================
  LISTA DE CONVIDADOS
   Adicione 5 convidados à sua lista

  > Informe o primeiro convidado: Luana Pines
  > Informe o segundo convidado: Carlos Moreira
  > Informe o terceiro convidado: Gabriela Silva
  > Informe o quarto convidado: Sandra Nunes
  > Informe o quinto convidado: Pedro Pascal

  Convidados
   1: Luana Pines
   2: Carlos Moreira
   3: Gabriela Silva
   4: Sandra Nunes
   5: Pedro Pascal
  =====================
  ```

<br />

### Lista de convidados PLUS

Este programa armazena em um vetor o nome de, no máximo, 100 convidados de uma festa e os exibe ao fim.

- Exemplo de saída:

  ```bash
  =====================
  LISTA DE CONVIDADOS PLUS

  > Informe a quantidade de nomes (máximo de 100): 0
  >> Número de convidados inválido!
  > Informe a quantidade de nomes (máximo de 100): 101
  >> Número de convidados acima do limite!
  > Informe a quantidade de nomes (máximo de 100): 3

  > Informe o nome do 1° convidado: Carla Rodrigues
  > Informe o nome do 2° convidado: Amilton Dias
  > Informe o nome do 3° convidado: Jenifer Garcia

  Convidados
   - Convidado 1: Carla Rodrigues
   - Convidado 2: Amilton Dias
   - Convidado 3: Jenifer Garcia
  =====================
  ```

<br />

### Lista de convidados PLUS 2

Este programa armazena em um vetor o nome de, no máximo, 100 convidados de uma festa, que podem ser fornecidos continuamente, e os exibe ao fim.

- Exemplo de saída:

  ```bash
  =====================
  LISTA DE CONVIDADOS PLUS+
   Insira o nome de seus convidados.

  > Insira o nome do 1° convidado: Adelaide Hills

  > Deseja adicionar mais nomes? [S/n] s

  > Insira o nome do 2° convidado: Gregory Sampaio

  > Deseja adicionar mais nomes? [S/n] n

  --- Lista de convidados ---

  - Convidado 1: Adelaide Hills
  - Convidado 2: Gregory Sampaio
  =====================
  ```

<br />

### Somar idades acima de 18 anos

Este programa soma as idades informadas que são maiores que 18.

- Exemplo de saída:

  ```bash
  =====================
  SOMA MAIS 18 ANOS
   Programa que soma as idades informadas acima de 18 anos

  > Informe a idade da 1° pessoa: 20
  > Informe a idade da 2° pessoa: 12
  > Informe a idade da 3° pessoa: 11
  > Informe a idade da 4° pessoa: 5
  > Informe a idade da 5° pessoa: 17
  > Informe a idade da 6° pessoa: 17
  > Informe a idade da 7° pessoa: 15
  > Informe a idade da 8° pessoa: 16
  > Informe a idade da 9° pessoa: 18
  > Informe a idade da 10° pessoa: 30

  >> A soma das idades maiores de 18 anos é: 50
  =====================
  ```

<br />

### Somar idades

Este programa soma a idade de cinco pessoas.

- Exemplo de saída:

  ```bash
  =====================
  SOMAR IDADES
   Programa que soma a idade de cinco pessoas

  > Informe a idade da 1° pessoa: 12
  > Informe a idade da 2° pessoa: 27
  > Informe a idade da 3° pessoa: 19
  > Informe a idade da 4° pessoa: 54
  > Informe a idade da 5° pessoa: 62

  >> A soma de todas as idades é: 174
  =====================
  ```

<br />

### Somar total de uma compra

Este programa soma o total absoluto de uma compra a partir dos preços fornecidos.

- Exemplo de saída:

  ```bash
  =====================
  SOMAR TOTAL DE UMA COMPRA

  > Informe a quantidade de produtos comprados: 3

  > Informe o preço do 1° produto: 10
  > Informe o preço do 2° produto: 2,99
  > Informe o preço do 3° produto: 12,50       

  >> O total da compra é: R$ 25,49
  =====================
  ```

<br />

### Olá mundo

Famoso Hello world :)

- Exemplo de saída:

  ```bash
  =====================
  Olá, mundo!
  =====================
  ```

<br />

### Criar recibo

Este programa cria o recibo de uma compra com base nos produtos, quantidades e preços unitários fornecidos.

- Exemplo de saída:

  ```bash
  =====================
  CRIAR RECIBO

  > Informe o nome do produto: arroz
  > Informe a quantidade de arroz: 2
  > Informe o preço unitário do produto: 16,80

  > Deseja adicionar mais itens? [S/n] s

  > Informe o nome do produto: feijão
  > Informe a quantidade de feijão: 3
  > Informe o preço unitário do produto: 14

  > Deseja adicionar mais itens? [S/n] n

  --- RECIBO ---
  N°      -   PRODUTO   -   QUANT.   -   PREÇO
  1       -    arroz    -     2      -   R$ 16.8
  2       -   feijão    -     3      -   R$ 14.0
  TOTAL   -   R$ 75.6
  =====================
  ```

<br />

### Tabuada

Este programa imprime no terminal a tabuada do número desejado.

- Exemplo de saída:

  ```bash
  =====================
  TABUADA

  > Indique o número que deseja a tabuada: [1-10] 7

  Tabuada do 7:
  7 * 1 = 7
  7 * 2 = 14
  7 * 3 = 21
  7 * 4 = 28
  7 * 5 = 35
  7 * 6 = 42
  7 * 7 = 49
  7 * 8 = 56
  7 * 9 = 63
  7 * 10 = 70

  > Deseja ver mais alguma tabuada? [S/n] n
  =====================
  ```

<br />

### Classificar idade

Este programa classifica a idade do usuário com base no ano de seu nascimento.

- Exemplo de saída:

  ```bash
  =====================
  CLASSIFICAR IDADE

  > Por favor, informe seu ano de nascimento: [4 dígitos] 2004

  >> Sua idade aproximada é: 19

  >> É idoso: false
  >> É criança: false
  >> É adulto: true
  >> É adolescente: false
  >> É debutante: false
  >> É eleitor: true
  =====================
  ```

<br />

### Triângulo I

Este programa imprime um triângulo como o do exemplo abaixo no terminal.

- Exemplo de saída:

  ```bash
  =====================
  *
  **
  ***
  ****
  *****
  ******
  *******
  ********
  *********
  **********
  =====================
  ```

<br />

### Triângulo II

Este programa imprime um triângulo como o do exemplo abaixo no terminal.

- Exemplo de saída:

  ```bash
  =====================
  ##########
  #########
  ########
  #######
  ######
  #####
  ####
  ###
  ##
  #
  =====================
  ```
