package TwoDArrays;

public class As2_Vigenere {



    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        char[][] vigenere = createVSquare(alphabet);


        printSquare(vigenere);


    }//run


    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];

        for (int row = 0; row < alphabet.length; row++) {
            for (int col = 0; col < square[row].length; col++) {

                int index = row + col;
                if (index >= alphabet.length) {
                    index -= alphabet.length; // Wrap around
                }
                square[row][col] = alphabet[index];

            }//for col
        }//for row

        return square;

    }//createVSquare



    public static void printSquare(char[][] square) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
    }//end printS



    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }//linear search




}//end class
