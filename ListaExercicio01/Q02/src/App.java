import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Informe a idade do jogador");

        idade = scanner.nextInt();

        if(idade == 14 || idade == 15){
            System.out.println("Categoria Infantil");
        }else if(idade == 16 || idade == 17){
            System.out.println("Categoria Juvenil");
        }else if(idade == 18 || idade == 20){
            System.out.println("Categoria Júnior");
        }else if(idade > 20){
            System.out.println("Categoria Profissional");
        }else{
            System.out.println("Não podemos classificar essa idade");
        }

    }
}
