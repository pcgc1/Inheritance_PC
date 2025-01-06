package TwoDArrays;

public class Ex1_GolfCard {

    public static void run(){

        String[] names = { "Bob", "Serena", "Gill", "Steve"};
        int[][] scorecard = new int[4][18];

        for (int row = 0; row < scorecard.length; row++) {
            for (int col = 0; col < scorecard[row].length; col++) {
                System.out.println(scorecard[row][col]);
            }
        }

    }//run


}//class