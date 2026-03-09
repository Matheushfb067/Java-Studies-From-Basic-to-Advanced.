package academy.maratonajava.introducao;

/*
PRATICA:

Crie variaveis para os campos descritos abaixo e imprima entre <> e imprima a seguinte mensagem:

Eu <nome> morando no endereço <endereço>
confirmo que recebi o salario de <salario>, na data <data>
 */

public class Exercicio01 {
    public static void main(String[] args) {
        String nome = "Batman";
        String endereco = "GotanCity";
        double salario = 2000.0;
        String data = "02/06/2026";

        System.out.println("Eu "+nome+ " morando no endereço " +endereco+
                " confirmo que recebi o salario de " +salario+ ", na data "+data);
    }
}
