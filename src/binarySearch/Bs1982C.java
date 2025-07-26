package binarySearch;

import java.util.*;
public class Bs1982C {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int win = 0;
            long sum = 0;
            int left = 0;
            for(int i=0;i<n;i++){
                sum += arr[i];

                while(sum > r){
                    sum -= arr[left++];
                }
                if(sum >= l){
                    sum = 0;
                    win++;
                    left = i + 1;
                }
            }
            System.out.println(win);
        }
    }
}
