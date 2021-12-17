package aula1;

import java.text.NumberFormat;
import java.util.Scanner;

class Produto {
    public String nome;
    public double valor;
    public int qtd;

    public Produto(String nome, double valor, int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Produto[] produtos = new Produto[3];
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        double valorTotalCompra = 0;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe o nome do produto: ");
            String nomeProduto = s.next();

            System.out.println("Informe o valor do produto: ");
            double valorProduto = s.nextDouble();

            System.out.println("Informe a quantidade do produto: ");
            int qtdProduto = s.nextInt();

            produtos[i] = new Produto(nomeProduto, valorProduto, qtdProduto);

            valorTotalCompra = valorTotalCompra + (valorProduto * qtdProduto);
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + i);
            System.out.println(produtos[i].nome);
            System.out.println(numberFormat.format(produtos[i].valor));
            System.out.println("Quantidade: " + produtos[i].qtd + "\n");
        }

        System.out.println("Valor total: " + valorTotalCompra);
    }
}
