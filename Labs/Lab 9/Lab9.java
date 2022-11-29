
public class Lab9 {
  public static void addTo10(int [][] array) {
      /************************************************
       * Determine how to change 0 to make the array add to 10
       ************************************************/
        int sum;
        int num = 0;
      /************************************************
       * Sees how long the array is
       ************************************************/
      for (int i = 0; i < array.length; i++) {
            sum = 0;
          /************************************************
           * Adds up the array and determines where the 0 is in the array
           ************************************************/
          for (int x = 0; x < array[i].length; x++) {
                sum += array[i][x];
                if (array[i][x] == 0) {
                    num = x;
                }
            }
          /************************************************
           * Replaces 0 with a number to add up to 10
           ************************************************/
            array[i][num] = 10 - sum;
        }
  }
   
  public static void setHints(int [][] array) {
      /************************************************
       * Sets up the array cordinates
       ************************************************/
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                /************************************************
                 * Determines if cordinates has a bomb
                 ************************************************/
                if (isBomb(array[i][x]) == true) {
                    int num = -1;
                    /************************************************
                     * Process helps determine what spots are around a bomb and how many bombs they're around
                     ************************************************/
                    while (num < 2) {
                        int del = -1;
                        while (del < 2) {
                            if (isInBounds(i + num, x + del, array) == true) {
                                int space = array[i + num][x + del];
                                if (isBomb(space) == false) {
                                    array[i + num][x + del] += 1;
                                }
                            }
                            del++;
                        }
                        num++;
                    }
                }
            }
        }
  }
   
  public static boolean isInBounds(int i, int j, int[][] board){
         return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
  }

  public static boolean isBomb(int value){
         return value == -1;
  }

   
   public static void main(String[] args) { 
     int [][] matrix = {{6, 3, 2, 0, 4}, {34, 53, 0, 23, 1}, {0, 23, 54, 11, 7}};
     
     int [][] matrix2 = {{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, -1, 0, -1},
       {0, 0, 0, -1, 0, 0}, {0, 0, 0, 0, 0, 0}};
     int [][] matrix3 = { { 0, -1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
    
     addTo10(matrix);
     setHints(matrix2);
     setHints(matrix3);
   
  } 
   
 }




