package math;

import java.util.*;

//C. Yet Another Permutation Problem

public class Math1858C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n + 1];
//            StringBuilder sb = new StringBuilder();

            for (int l = 1; l <= n; ) {
                while (l <= n && arr[l] == 1) l++;
                if (l == n && arr[l] == 1) break;
                int r = l;
                while (r <= n) {
                    if (arr[r] == 0) {
                        System.out.print(r + " ");
                        arr[r] = 1;
                    }
                    r = 2 * r;
                }
            }
//            System.out.println(sb.toString());
        }
    }
}