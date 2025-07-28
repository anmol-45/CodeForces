package math;

import java.util.*;
//C1. Shohag Loves XOR (Easy Version)
public class Math2039C {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            long m = sc.nextLong();

            long n = 0;
            long ele = 1;  // Start from 2^0 = 1

            while (ele <= x) {
                ele <<= 1; // Same as ele = ele * 2
                n++;
            }

//            ele = 1;
//            ele <<= n;
//            System.out.println("ele" + ele);
//            if(ele != x){
//                n++;
//            }

            long ans = 0;
            long len = 1;
            len = Math.min( len<<=n, m);
            for(long y=1;y<=len;y++){
                long xor = x^y;
                if(xor%x == 0 || xor%y == 0)
                    ans++;
            }

            System.out.println(ans);
        }
    }
}
