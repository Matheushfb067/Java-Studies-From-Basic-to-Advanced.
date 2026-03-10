package academy.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoAComprarBebida = idade >= 18;

        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcolica!");
        }

        if(isAutorizadoAComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica!");
        }

        if(isAutorizadoAComprarBebida == false){
            System.out.println("Não autorizado a comprar bebida alcolica!");
        }

        if(!isAutorizadoAComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcolica!");
        }

        boolean c = true;
        if(c = false){
            System.out.println("Dentro de algo que não deve ser feito ");
        }

        System.out.println("Fora do IF");
    }
}
