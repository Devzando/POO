public class SimpleStartup {
    private int[] locationCells;
    private int[] acertos = {0, 0, 0, 0, 0};
    private int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(int guess){
        String result = "miss";

        for(int cell2: acertos){
            if(cell2 == guess){
                System.out.println("digite direito seu porra");
                result = "not hit";
                return result;
            }
        }

        for(int cell: locationCells ){
            if(guess == cell){
                result = "hit";
                acertos[numOfHits] = guess;
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result; 
    }
}
