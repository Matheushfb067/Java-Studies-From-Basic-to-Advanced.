package academy.maratonajava.introducao;

public class PrimitiveTypes01 {
    public static void main(String[] args) {
        // int, double, float, chat, byte, short, long, boolean
        int idade = 21; // numeros inteiros 4 bytes
        long numeroGrande = 100000;
        double salarioDouble = 2000; // numeros com virgula 8 bytes
        float salarioFloat = 2500; // numeros com virgula 4 bytes
        byte idadeByte = -128; // maximo 127 de tamanho 1 byte
        short idadeShort = 10;
        boolean verdadeiro = true; // velores logicos (verdadeiro ou falso) um unico bit (0/1)
        boolean falso = false; // velores logicos (verdadeiro ou falso) um unico bit (0/1)
        char caractere = 65; // traduz um valor numerico para tabela ASCII ou unicode!
        String nome = "Matheus"; // Strings são cadeias de caracteres e não são considerados um tipo primitivo

        System.out.println("A idade é: "+idade+" anos.");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char: "+caractere);
        System.out.println(nome);
    }
}
