package TwoDArrays;

import java.util.Scanner;

public class As2_Vigenere {

    public static Scanner input = new Scanner(System.in);

    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        char[][] vigenereSquare = createVSquare(alphabet);


        printSquare(vigenereSquare);

        //ask for key
        System.out.println("What is your key?");
        String key = input.nextLine();

        //decipher message
        System.out.println("What is your message?");
        String message = input.nextLine();

        //create key stream for message
        char[] keyStream = createKeystream(message, key);


        //decode each char
        for (int i = 0; i < message.length(); i++) {
            char encChar = message.charAt(i);
            char keyChar = keyStream[i];

            int row = linearSearch(alphabet, keyChar);//find row that keystream char is in

            int col = linearSearch(vigenereSquare[row], encChar);//find which column encrypted char is in

            System.out.print(alphabet[col]);

        }//end for i


//        for(int i = 0; i < keyStream.length; i++) {
//            System.out.print( keyStream[i] );
//        }



    }//run


    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];

        for (int row = 0; row < alphabet.length; row++) {
            for (int col = 0; col < square[row].length; col++) {

                int index = row + col;
                if (index >= alphabet.length) {// when index goes past last letter in the alphabet, start again from A
                    index -= alphabet.length; // Wrap around
                }
                square[row][col] = alphabet[index];

            }//for col
        }//for row

        return square;

    }//createVSquare



    public static void printSquare(char[][] square) {

        System.out.print("  ");
        for (int i = 0; i < square.length; i++) {
            System.out.print("\u001B[33m" + square[i][0] + " ");
        }
        System.out.println(" ");

        for (int row = 0; row < square.length; row++) {
            System.out.print("\u001B[33m" + square[row][0] + " ");
            for (int col = 0; col < square[row].length; col++) {
                System.out.print("\u001B[0m" + square[row][col] + " ");
            }
            System.out.println();
        }
    }//end printS



    public static char getChar(char[][] square, int rowNum, int colNum){

        return square[rowNum][colNum];

    }//return char


    public static char[] createKeystream(String message, String key){
//        char[] key = {'S', 'C', 'O', 'N', 'A'};
        char[] fullKey = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            fullKey[i] = key.charAt( i % key.length() );//loop index for key stream
        }

        return fullKey;

    }// create key stream



    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }//linear search




}//end class
