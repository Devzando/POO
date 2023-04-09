package ListaExercicio01.Q01.src;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1;
        int pares = 0;
        int menor = 0;
        int numRandom;

        
        for(int i = 0; i < 3; i++){
            System.out.println("Informe um número");
            num1 = scanner.nextInt();

            if(i == 0){
                menor = num1;
            }else{
                if(num1 < menor){
                    menor = num1;
                }
            }
            
            if(num1 % 2 == 0){
                pares++;
            }
        }

        numRandom = random.nextInt(11);

        
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de números pares: " + pares);
        
        if(menor/numRandom == 0){
            System.out.println("O menor número é divisível pelo número aleatório");
        }else{
            System.out.println("O menor número não é divisível pelo número aleatório");
        }
    }
}
