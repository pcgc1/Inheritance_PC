package TwoDArrays;

public class Ex1_GolfCard {

    public static void run(){

        String[] names = { "Bob", "Serena", "Gill", "Steve"};
        int[][] scorecard = new int[4][18];

        //hole 1
        scorecard[0][0] = 4;
        scorecard[1][0] = 3;
        scorecard[2][0] = 5;
        scorecard[3][0] = 4;

        //hole 2
        scorecard[0][1] = 6;
        scorecard[1][1] = 3;
        scorecard[2][1] = 10;
        scorecard[3][1] = 6;

        //hole 3
        scorecard[0][2] = 5;
        scorecard[1][2] = 3;
        scorecard[2][2] = 3;
        scorecard[3][2] = 5;

        //hole 4
        scorecard[0][3] = 2;
        scorecard[1][3] = 3;
        scorecard[2][3] = 2;
        scorecard[3][3] = 4;



        System.out.println("Name      Scores");

        int total = 0;
        for (int row = 0; row < scorecard.length; row++) {

            System.out.print(names[row] + "  ");

            for (int col = 0; col < scorecard[row].length; col++) {
                total += scorecard[row][col];

                System.out.print(scorecard[row][col] + "  ");
            }
            System.out.println();
            System.out.println(names[row] + ": " + total);
        }

        int holeOneTotal = 0;
        for (int row = 0; row < scorecard.length; row++) {
            holeOneTotal += scorecard[row][0];
        }

        System.out.println(holeOneTotal/names.length);



    }//run


}//class