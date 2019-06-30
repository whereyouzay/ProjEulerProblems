Find the largest palindrome made from the product of two 3-digit numbers.

/*
 * By Ramzi
 * https://github.com/whereyouzay
 * 
 */
package largespalindrome;
import java.lang.Math;
import java.util.Scanner;


public class LargesPalindrome_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int num1 = userIn.nextInt();
        int num2 = userIn.nextInt();
        
        System.out.println("Largest Palindrome: "+ largestPalindrome(num1, num2));
    }
    

    public static int reverseInt(int num){
        long reversedNum = 0;
        long numInt = num;
        
        while(numInt != 0){
            reversedNum = reversedNum * 10 + numInt % 10;
            numInt = numInt / 10;
            //System.out.println("num: " +num+" Reversed: "+reversedNum);  		        //test
        }
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE){
            throw new IllegalArgumentException();
        }
        return (int) reversedNum;
    }
    
    public static boolean isPalindrome(int num){
        return reverseInt(num) == num;
    }
    
    public static int largestPalindrome(int num1, int num2){
        int result = 0;
        int greatestP = 0;
        
        for(int i = num1; i >= 0; i--){
            for(int j = num2 ; j >= 0; j--){
               
                result = i*j;
                if(isPalindrome(result)){
                    greatestP = Math.max(greatestP, result);
                    //System.out.println("Mutliples: "+ i+ " "+j+" " + result); 		//test
                }
                
            } 
            
        }
        
        return greatestP;
    }
}

