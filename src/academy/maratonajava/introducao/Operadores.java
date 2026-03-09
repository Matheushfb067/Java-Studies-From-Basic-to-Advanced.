package academy.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // +, -, /, * <- operadores aritmeticos
        int numero01 = 10;
        int numero02 = 20;

        int soma = numero01+numero02;
        int subtracao = numero01-numero02;

        System.out.println(subtracao);
        System.out.println(soma);

        int multiplicacao = numero01*numero02;
        System.out.println(multiplicacao);

        double divisao = (double) numero01 / numero02;
        System.out.println(divisao);
    }
}
