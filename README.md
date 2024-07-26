# Calculadora

## Descrição

O programa **Calculadora** é uma aplicação Java simples que permite ao usuário realizar operações aritméticas básicas: adição, subtração, multiplicação e divisão. A interface é baseada em texto, onde o usuário escolhe a operação desejada e insere os números para realizar o cálculo.

## Funcionalidades

1. **Adição**: Soma dois números fornecidos pelo usuário.
2. **Subtração**: Subtrai o segundo número do primeiro.
3. **Multiplicação**: Multiplica dois números fornecidos pelo usuário.
4. **Divisão**: Divide o primeiro número pelo segundo, exibindo o resultado.

## Estrutura do Código

### Classe `Calculadora`

- **Construtor**:
  - `Calculadora()`: Exibe um menu de operações, solicita ao usuário que escolha uma operação e insira dois números. Em seguida, chama o método `contas` para realizar o cálculo baseado na escolha do usuário.

- **Métodos**:
  - `contas(int escolha, float num, float num2)`: Realiza a operação aritmética escolhida pelo usuário e exibe o resultado.
    - **Parâmetros**:
      - `escolha`: Um inteiro que representa a operação escolhida (1 para adição, 2 para subtração, 3 para multiplicação, 4 para divisão).
      - `num`: O primeiro número fornecido pelo usuário.
      - `num2`: O segundo número fornecido pelo usuário.

### Método `main`

O método `main` cria uma nova instância da classe `Calculadora`, iniciando a aplicação.

## Como Executar

1. Certifique-se de ter o JDK instalado em sua máquina.
2. Compile o programa com o comando:
   ```sh
   javac Calculadora.java
   ```
3. Execute o programa com o comando:
   ```sh
   java Calculadora
   ```

## Exemplo de Uso

Ao executar o programa, o usuário verá o seguinte menu:
```
Qual operação deseja fazer?:
1: Adição
2: Subtração
3: Multiplicação
4: Divisão
```

O usuário deve escolher uma das opções digitando o número correspondente (1, 2, 3 ou 4). Se o usuário digitar um número válido, o programa pedirá que ele insira dois números. Após inserir os números, o programa calculará e exibirá o resultado da operação escolhida. Se o usuário digitar um número inválido, o programa exibirá a mensagem "Escolha uma das 4 opções!".

### Exemplo

- Escolha: 1 (Adição)
- Primeiro número: 10
- Segundo número: 5
- Saída: `Resultado: 15.0`

---
