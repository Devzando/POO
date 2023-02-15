package q01;
public class Shuffle1 {
    int x = 3;

    public void Execute(){
        while(x > 0){
            if(x > 2){
                System.out.print("a");
            }

            if(x == 2){
                System.out.print("b c");
            }

            x = x - 1;
            System.out.print("-");

            if(x == 1){
                System.out.print("d");
                x = x - 1; 
            }

        }
    }
}
