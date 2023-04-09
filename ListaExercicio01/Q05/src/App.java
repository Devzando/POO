import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int degraus;
        String aste = "*";
        int print;
        System.out.println("Digite a quantidade de degraus: ");
        degraus = scanner.nextInt();
        print = degraus;

        for(int i = 0; i < degraus; i++){
            for(int j = 0; j < print-1; j++){
                System.out.print(" ");
            }
            System.out.println(aste);
            aste += "*";
            print--;
        }

    }
}
