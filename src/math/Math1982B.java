package math;

import java.util.*;
//B. Collatz Conjecture
public class Math1982B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            while(k > 0 && x != 1){
                long rem = y - (x%y);

                if(rem >= k){
                    x +=k;
                    k = 0;
                }
                else{
                    x+=rem;
                    k-=rem;
                }

                while(x%y == 0){
                    x = x/y;
                }

            }

            if(k > 0){
                k %= (y-1);
                x +=k;
            }
            System.out.println(x);
        }
    }
}

