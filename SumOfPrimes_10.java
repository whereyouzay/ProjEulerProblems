Find the sum of all the primes below two million.

/*
 * By Ramzi A].
 * https://github.com/whereyouzay
 * 
 */

package sumofprimes;
import java.lang.Math;

public class SumOfPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primes;
        int[] primeNumber = new int[2000000];
        int elements = 0;
        int sum = 0;
                
        for (primes = 2; primes < 2000000; primes++){
            if(isPrime(primes)==true){
                primeNumber[elements]= primes;
                elements++;
            }
        }
        
        for (int i = 0; i <elements; i++){
            sum += primeNumber[i];
        }
        for(int i = 0; i < 15; i++){
            System.out.println(primeNumber[i]);
        }
        System.out.println("Sum of Primes: "+ sum+ "\nElements: "+ elements);
    }

    public static boolean isPrime(int x){
        
        for(int i = 2; i <= Math.sqrt(x); i++){ //a composite number will always have a prime divisor under the square root of n
            if(x % i==0){
                return false;
            }
        }
        return true;
    } 
}


