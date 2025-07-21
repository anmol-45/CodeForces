package binarySearch;

import java.util.Scanner;

public class bs2026B {
    static Scanner sc = new Scanner(System.in);

    private static boolean isPossible(long[] arr , int n , int k){
        int cnt = 0;
        for(int i=1;i<n;i++){
            long diff = Math.abs(arr[i] - arr[i-1]);
            if((int)diff > k){
                cnt++;
            }
            if(cnt > 1)
                return false;
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

            int low =1 ;
            int high = 0;
            for(int i=1;i<n;i++){
                long diff = Math.abs(arr[i] - arr[i-1]);
                high = Math.max(high , (int) diff);
            }
            int ans = 0;
            while(low<= high){
                int mid = low + (high-low)/2;

                if(isPossible(arr , n , mid)){
                    ans = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            if(n == 1) System.out.println(1);
            else System.out.println(ans);
        }
    }
}
