package contes1044;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long[] arr = new long[n];

            for(int i=0;i<n;i++){
//                long ele = sc.nextLong();

                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long ans = 0;

            if(n%2 == 1){
                ans = arr[0];

                int i = n-1;
                int j = n-1;

                while(i>1){
                    long a = arr[i];
                    long b = arr[j];
                    i-=2;
                    j-=2;

                    ans += Math.max(a , b);
                }
            }
            else{
                int i = n-2;
                int j = n-1;
                while(i>=0){
                    ans += Math.max(arr[i]  , arr[j]);
                    i-=2;
                    j-=2;
                }
            }

            System.out.println(ans);
        }

    }
}
