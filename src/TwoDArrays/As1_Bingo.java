package TwoDArrays;

public class As1_Bingo {

   public static char[] allLetters = {'B', 'I', 'N', 'G', 'O'};

    public static void run(){

        int[] row1 = generateArray(5, 1, 15);
        int[] row2 = generateArray(5, 16, 30);
        int[] row3 = generateArray(5, 31, 45);
        int[] row4 = generateArray(5, 46, 60);
        int[] row5 = generateArray(5, 61, 75);

        int[][] bingoCard = {row1, row2, row3, row4, row5};

        printBingo(bingoCard);


    }//run


    public static int[] generateArray(int arrLength, int min, int max){
        int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                int num =  (int) (Math.random() * (max - min + 1)   + min);
                arr[i] = num;
            }
        return arr;
    }//generate array


    public static void printBingo(int[][] grid) {
        for (int row = 0; row < 5; row++) {
            System.out.print(allLetters[row] + " ");
            for (int col = 0; col < 5; col++) {

                System.out.print(grid[row][col] + " ");

            } // col
            System.out.println();
        } // row
    }// printSudoku

}//class
