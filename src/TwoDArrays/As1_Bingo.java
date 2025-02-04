package TwoDArrays;

import java.util.Scanner;

public class As1_Bingo {

    public static Scanner input = new Scanner(System.in);
   public static char[] allLetters = {'B', 'I', 'N', 'G', 'O'};

    public static void run(){

        int[] row1 = generateArray(5, 1, 15);
        int[] row2 = generateArray(5, 16, 30);
        int[] row3 = generateArray(5, 31, 45);
        int[] row4 = generateArray(5, 46, 60);
        int[] row5 = generateArray(5, 61, 75);

        int[][] bingoCard = {row1, row2, row3, row4, row5};


        while(true){

            //Print bingo card
            printBingo(bingoCard);

            //Print random number
            input.nextLine();
            int ranNum = myRandom(1,75);
            System.out.println("The number chosen is: " + ranNum);

            //Check bingo card
            for (int row = 0; row < bingoCard.length; row++) {
                for (int col = 0; col < bingoCard[row].length; col++) {
                    if( bingoCard[row][col] == ranNum){
                        bingoCard[row][col] *= -1;
                    }
                }//for col
            }//for row


            //check for winner

            //check rows
            for (int i = 0; i < 5; i++) {
                if( checkRow(bingoCard[i]) ){
                    System.out.println("BINGO!");
                    break;
                }
            }

            //check columns
//            for (int i = 0; i < 5; i++) {
//                if( checkCol(bingoCard, i) ){
//                    System.out.println("BINGO!");
//                    break;
//                }
//            }



        }//while true

    }//run


    public static int[] generateArray(int arrLength, int min, int max){
        int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                int num =  (int) (Math.random() * (max - min + 1)   + min);
                arr[i] = num;
            }
        return arr;
    }//generate array



    public static int myRandom (int min, int max){
        int num =  (int) (Math.random() * (max - min + 1)   + min);
        return num;
    }//random



    public static void printBingo(int[][] grid) {
        for (int row = 0; row < 5; row++) {
            System.out.print(allLetters[row] + " ");
            for (int col = 0; col < 5; col++) {

                System.out.print(grid[row][col] + " ");

            } // col
            System.out.println();
        } // row
    }// printSudoku



    public static boolean checkRow(int[] row){

        for (int i = 0; i < row.length; i++) {
            if(row[i] < 0){

            }
        }
        
        return false;
    }//check row



    public static boolean checkCol(int[][]twoDArray, int colNum){

        return false;
    }//check col

}//class
