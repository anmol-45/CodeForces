package math;

import java.io.IOException;
import java.util.Scanner;

public class Math230B {
    public static void main(String[] args) throws IOException {
        StringBuilder output = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        boolean[] isPrime = new boolean[];

        //calculating the prime at first

        for(int i=0;i<n;i++){
            long ele = sc.nextLong();

            if(isPrime(ele)){
                System.out.println("NO");
            }
            else
                System.out.println(checkPossibility(ele));
        }
    }

    private static String checkPossibility(long ele){

        for(long j=2;j*j < ele;j++){
            if(ele%j == 0)
                return "NO";
        }
        return "YES";

    }

    private static boolean isPrime(long n){
        if(n == 1)
            return true;

        for(long i=2;i*i <= n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }


}
