//What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?

/*
 * By Ramzi A.
 * https://github.com/whereyouzay
 * 
 */
package largestprodingrid;
import java.util.Random;
import java.util.Scanner;

public class LargestProductInGrid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Width and Height of the grid:");
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        fillAndPrint(row, column);
        
        
    }
    public static void fillAndPrint(int row, int column){
        int[][] grid = new int[row][column];
        Random rand = new Random();
        
        for(row = 0; row < grid.length; row++){                              //iterate through row
            if(row != 0){
                System.out.print("\n");
            }
            for(column = 0; column < grid[row].length; column++){           //iterate through column
                grid[row][column]= rand.nextInt(101);           //populate
                System.out.print(grid[row][column]+" ");        //print
                
            }
        }
        System.out.println();
    }
}
