A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

/*
 * By Ramzi A.
 * https://github.com/whereyouzay
 * 
 */
package pythagoreantriplets;


public class PythagoreanTriplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a*a + b*b = c*c
        //a+b+c = 1000
        
        final int sum = 1000;
        int a = 0, b = 0, c = 0;
        long product = 0;
        
        for(a=1; a <= sum/3; a++){
            for(b=0; b <= sum/2; b++){
                c = sum - a - b;
                if(a*a + b*b == c*c && a<b){
                    System.out.printf("a=%d, b=%d, c=%d", a, b, c);
                    product = a*b*c;
                    System.out.print("\n a*b*c = "+ product + "\n");
                }
            }
        }
    }
}
