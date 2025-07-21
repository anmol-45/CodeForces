package binarySearch;

import java.util.Scanner;

public class bs2026B {
    static Scanner sc = new Scanner(System.in);

    private static boolean isPossible(long[] arr , int n , long k){
        boolean used = false;

        for(int i=0;i<n;){
            if(i == n-1){
                if(used)
                    return false;
                break;
            }

            long x = arr[i];
            long y = arr[i+1];

            if(y-x > k) {
                if(!used) {
                    used = true;
                }
                else {
                    return false;
                }
                i++;
            }
            else {
                i += 2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            long low =1 ;
            long high = 1000000000000000005L;
            long ans = 0;
            while(low<= high){
                long mid = low + (high-low)/2;

                if(isPossible(arr , n , mid)){
                    ans = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
//            if(n == 1) System.out.println(1);else
            System.out.println(ans);
        }
    }
}
