// Questão 1
// a) Maior que 5.
// b) A estrutura condicional permite que o programa tome decisões, escolhendo qual bloco de código executar caso uma condição seja verdadeira ou falsa.

// Questão 2
// b) Apenas II, III e IV estão corretas.

// Questão 3
// c) A JRE é suficiente para executar aplicações Java, mas não para desenvolvê-las.

// Questão 4
// b) -128

// Questão 5
// b) Todos armazenam números inteiros, mas possuem diferentes intervalos de valores.

// Questão 6
// c) Executa diretamente arquivos .java.

// Questão 7
// c) Jogos de alto desempenho

// Questão 8
// O Java é compilado e interpretado. O código fonte é compilado gerando um código bit. Depois, a JVM interpreta esse código bit na hora da execução.

// Questão 9
// JDK é o kit para o programador criar o sistema pois possui compilador. JRE é o ambiente de execução usado apenas para rodar os sistemas depois de pronto.

// Questão 10
import java.util.Scanner;

public class ExercicioCinema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Lendo as quantidades
        System.out.println("Quantos ingressos INTEIROS foram vendidos?");
        int qtdInteira = teclado.nextInt();

        System.out.println("Quantos ingressos MEIA foram vendidos?");
        int qtdMeia = teclado.nextInt();

        // 2. Lendo os valores como texto (String) e trocando vírgula por ponto pra faciliar tudo
        System.out.println("Qual o valor do ingresso INTEIRO?");
        String textoValorInteira = teclado.next();
        textoValorInteira = textoValorInteira.replace(",", ".");
        double valorInteira = Double.parseDouble(textoValorInteira);

        System.out.println("Qual o valor do ingresso MEIA?");
        String textoValorMeia = teclado.next();
        textoValorMeia = textoValorMeia.replace(",", ".");
        double valorMeia = Double.parseDouble(textoValorMeia);

        // 3. Fazendo os cálculos
        double totalInteiras = qtdInteira * valorInteira;
        double totalMeias = qtdMeia * valorMeia;
        double totalArrecadado = totalInteiras + totalMeias;

        int totalIngressos = qtdInteira + qtdMeia;
        double valorMedio = totalArrecadado / totalIngressos;

        // 4. Mostrando o resultado
        System.out.println("Total arrecadado inteira: " + totalInteiras);
        System.out.println("Total arrecadado meia: " + totalMeias);
        System.out.println("Total arrecadado na sessao: " + totalArrecadado);
        System.out.println("Valor medio por ingresso: " + valorMedio);

        teclado.close();
    }
}
