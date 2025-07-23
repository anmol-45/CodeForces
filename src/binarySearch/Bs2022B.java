package binarySearch;

import java.util.Scanner;

//B. Kar Salesman
public class Bs2022B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-- > 0){


            int n = sc.nextInt();
            int x = sc.nextInt();

            long high =  0;
            long low = Long.MIN_VALUE;

            for(int i=0;i<n;i++){
                long ele = sc.nextLong();

                high += ele;
                low = Math.max(low , ele);
            }

            System.out.println(Math.max(low , (high + x-1)/ x));
        }
    }
}
