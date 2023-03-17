import java.util.*;
class SimpleStartupGame {
    
    public static void main(String[] args) {
        int numOfGuesses = 0;
        
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();

        int randonNum = (int) (Math.random() * 5);

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randonNum));
        locations.add(Integer.toString(randonNum+1));
        locations.add(Integer.toString(randonNum+2));

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
            int guess = helper.getUserInput("enter a number");
            String result = theStartup.checkYourself(Integer.toString(guess));

            numOfGuesses++;

            if(result.equals("kill")){
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
    
}
