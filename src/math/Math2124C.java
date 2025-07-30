package math;
import java.util.*;
public class Math2124C {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] b = new int[n];

            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }

            long x = 1;
            long gcd = 0;

            for(int i=1;i<n;i++){

                if(b[i] % b[i-1] != 0){
                    x = lcm(x , (long)b[i-1]/gcd(b[i], b[i-1]));
                }
            }
            System.out.println(x);
        }
    }

    private static long gcd(long a , long b){
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }

    private static long lcm(long a , long b){
        return a*b/gcd(a , b);
    }
}

