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

        //-------------------------------------------------------

        // %, <, >, <=, >=, ==, != <- operadores relacionais

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualAVinte);
        System.out.println(isDezIgualADez);
        System.out.println(isDezDiferenteDeDez);

        //-------------------------------------------------------

        // &&(AND), ||(OR), !(NOT) <- operadores lógicos
        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        //-------------------------------------------------------

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        //-------------------------------------------------------

        // =, +=, -=, *=, /=, %= <- operadores de atribuição

        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000;
        System.out.println(bonus);
        bonus -= 1000; // bonus = bonus - 1000;
        System.out.println(bonus);
        bonus *= 2; // bonus = bonus * 1000;
        System.out.println(bonus);
        bonus /= 2; // bonus = bonus / 1000;
        System.out.println(bonus);
        bonus %= 2; // bonus = bonus % 1000;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++; // incremento de 1 // ++contador igual à contador++
        contador--; // decremento de 1 // --contador igual à contador--
        System.out.println(contador);

        /*
        Comportamento da diferença entre pós-incremento
        (contador2++) e pré-incremento (++contador2) em Java:
        */
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        System.out.println(++contador2);
    }
}
