import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        double delta;
        double x1,x2;

        System.out.println("Informe o coeficiente a: ");
        a = scanner.nextInt();
        System.out.println("Informe o coeficiente b: ");
        b = scanner.nextInt();
        System.out.println("Informe o coeficiente c: ");
        c = scanner.nextInt();

        delta = (b*b) - (4*a*c);
        
        if(delta > 0){
            x1 = ((-b) + Math.sqrt(delta)) / (2*a);
            x2 = ((-b) - Math.sqrt(delta)) / (2*a);
            System.out.println("As raízes são: " + x1 + " e " + x2); 
        }else{
            System.out.println("Não existe raízes reais");
        }

    }
}
