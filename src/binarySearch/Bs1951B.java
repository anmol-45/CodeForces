package binarySearch;

import java.util.*;
import java.util.stream.IntStream;

//B. Battle Cows
public class Bs1951B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt() - 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int idx = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[k]) {
                    idx = i;
                    break;
                }
            }
            int[] pos = IntStream.range(0, n).toArray();
            int result = 0;
            for (int start : new int[]{0, idx}) {
                if (start == -1) continue;
                swap(pos, start, k);
                int[] count = new int[n];
                int maxPos = pos[0];
                for (int j = 1; j < n; j++) {
                    if (arr[pos[j]] >= arr[maxPos]) maxPos = pos[j];
                    count[maxPos]++;
                }
                swap(pos, start, k);
                result = Math.max(result, count[pos[k]]);
            }
            System.out.println(result);
        }

    }
    private static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}