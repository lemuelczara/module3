# Módulo 3 - POO + Java

<br>

<h1 align="center">Java I</h1>

## Aula 1 - Introdução a Java - TM

### ⚔ Exercício 1

Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
que o usuário irá inserir pelo console. Lembre-se que um número é par quando divisível por 2.

[Resolução](./src/aula1/Ex1.java)

---

### ⚔ Exercício 2

Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
m valores que o usuário irá inserir via console. Lembre-se que um número a é divisível por b
quando o resto da divisão de a por b é igual a 0.

[Resolução](./src/aula1/Ex2.java)

---

### ⚔ Exercício 3

Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é
divisível por 1 e por si mesmo.

[Resolução](./src/aula1/Ex3.java)

---

### ⚔ Exercício 4

Desenvolva um programa para mostrar no console os primeiros n números primos entre 1
e m, sendo m um valor que o usuário irá inserir pelo console.

[Resolução](./src/aula1/Ex4.java)

---

### ⚔ Exercício 5

Desenvolver um programa para exibição por console os n primeiros números naturais que
têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
console.
Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
caso, a saída será: 33, 133 , 233, 303, 313.
Dependendo de como você decidir abordar a solução para este exercício, pode ser
necessário usar recursos que ainda não estudamos. Faz parte do desafio encontrar
soluções na Internet e utilizá-las.

[Resolução](./src/aula1/Ex5.java)

## Aula 1 - Introdução a Java - TT

### ⚔️ Exercício 1

Dados um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.

```java
Integer[] arr = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127}
```

Imprima no console:
 - Sua ordenação crescente;
 - Sua ordenação decrescente;

[Resolução](./src/aula1/Ex6.java)

---

### ⚔ Exercício 2

Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em
R$ 1,13 milhão e possui uma média de crescimento anual de 148%. Uma concorrente do ramo,
“Empresa Y”, é avaliada em R$ 18,4 milhões e com sua média de crescimento anual em 32%.

`Empresa X - 01/01/2021 - Valor da empresa: 1,13m`
`Empresa Y - 01/01/2021 - Valor da empresa: 18,4m`

Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
empresa X ultrapasse a empresa Y em seu valor de mercado.

[Resolução](./src/aula1/Ex7.java)

---

### ⚔ Exercício 3

Para um protótipo de supermercado, crie um programa que leia 3 produtos e
imprima no console: nome, preço, quantidade e o valor total da compra. Utilize um array como
estrutura de dados para armazenamento dos produtos informados.

```
Produto 1
Arroz
R$10.99
Quantidade: 2

Produto 2
Feijão
R$14.49
Quantidade: 1

Produto 3
Tomate
R$9.99
Quantidade: 5

Valor total: R$86.42
```

[Resolução](./src/aula1/Ex8.java)

<br>

<h1 align="center">Java II</h1>

## Aula 2 - Introdução a Java - TM

### ⚔ Exercício 1
Você precisa entregar um sistema para gerenciamento de turmas em uma determinada
escola.

 - Para isso você deverá desenvolver uma classe **Turma** que deve ter a série e o
   código identificador (8o ano A, 9o ano C, etc...), um vetor de disciplinas e um
   vetor de estudantes.
 - Crie a classe **Disciplina** que deve ter o nome e a carga horária
 - Crie a classe **Estudante** que deverá receber um nome, data de nascimento,
   número de matrícula e série.
   

   Por fim, você deverá criar uma classe principal para criar alguns estudantes e
   disciplinas e, em seguida, criar algumas turmas e inserir os estudantes e disciplinas já
   criados nessas turmas.

   > Para pensar: As relações entre turma e alunos/disciplinas são composições ou
   agregações? Por quê?

   Observação: A partir do Java 8 foi incluído uma excelente API para
   trabalharmos com datas. Portanto, atributos do tipo data devem ser
   declarados como LocalDate.
   
[Resolução](./src/aula2/Ex1.java)