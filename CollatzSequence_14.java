Which starting number, under one million, produces the longest chain?

/*
 * By Ramzi A.
 * https://github.com/whereyouzay
 * 
 */
package collatzsequence;

public class CollatzSequence_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // n = n/2 if even
        // n = 3n + 1 if odd
        int startingNum;
        int iterations = 0;
        int n = 0;
        int tempMax =0, maxNum = 0;
        
        for(startingNum = 2; startingNum <= 1000000; startingNum++){
            n = startingNum;
            while(n != 1){
               if (n%2 == 0){
                    n = n/2;
                }
               else if (n%2 == 1){
                   n = 3*n + 1;
               }
               System.out.println(n);
               iterations++;
               if(iterations > tempMax){
                   tempMax = iterations;
                   maxNum = startingNum;
               }
            }
        }    
        System.out.println("Starting Num with Highest Iterations: "+ maxNum +"\nNumber of Iterations: "+tempMax);
    }
}
