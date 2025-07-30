package math;

import java.util.*;
public class Math2021B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];


            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ans = findMex(arr , n , x);
            System.out.println(ans);
        }
    }

    private static int findMex(int[] arr, int n , int x) {

        int[] freq = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i] < n){
                freq[arr[i]]++;
            }
        }

        int mex = n;

        for(int i=0;i<n;i++){
            if(freq[i] == 0){
                mex = i;
                break;
            }
            if(freq[i] > 1){
                if(i+x < n)
                    freq[i+x] = freq[i+x] + freq[i] - 1;
            }
        }

        return mex;
    }
}

