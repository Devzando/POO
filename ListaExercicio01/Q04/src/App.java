import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        VerifyYear verifyYear = new VerifyYear();

        System.out.println("Digite um ano: ");
        verifyYear.setYear(scanner.nextInt());
        int year = verifyYear.getYear();

        if(year > 0){
            if(verifyYear.isLeap()){
                System.out.println("O ano " + year + " é bissexto.");
            }else{
                System.out.println("O ano " + year + " não é bissexto.");
            }
        }else{
            System.out.println(year + " não é um ano válido.");
        }

    }
}
