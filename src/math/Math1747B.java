package math;

import java.util.*;

//1474B - Different Divisors
public class Math1747B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();

            int ele = 1+d;
            while(!isPrime(ele))ele++;
            int prev = ele+d;
            while(!isPrime(prev))prev++;

            System.out.println(prev*ele);

        }

    }
    private static boolean isPrime(int n){
        if(n == 1)
            return false;

        for(int i=2;i*i <= n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}