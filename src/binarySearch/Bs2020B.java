package binarySearch;


import java.util.Scanner;
// 	2020B - Brightness Begins
public class Bs2020B {

    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-- > 0){


            long k = sc.nextLong();
            long low = 1;
            long high = (long) 4e18;
            long ans = (long)4e18;
            while(low<= high) {
                long mid = low + (high - low) / 2;

                long sqrt = (long) Math.sqrt(mid);
                //when dealing with larger number if we are finding the sqrt we must check below condition
                if ((sqrt + 1) * (sqrt + 1) <= mid) {
                    sqrt++;
                }
                if (sqrt * sqrt > mid) {
                    sqrt--;
                }

                long possible = mid - sqrt;
                if (possible >= k) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
//    time complexity: t * log(k) * sqrt(k)
}