package contes1044;

import java.util.Scanner;

public class QuestionC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long damage = 0;
            long[] arr = new long[n];
            for(int i=0;i<n;i++){

                long ele = sc.nextLong();

                damage+=ele;
                arr[i] = ele;
            }

//            damage -= (n-1);

            long prev2 = 0 , prev= 0 ;

            //finding the falls that is extra
//            house robber dp
            for(int i=1;i<n;i++){
                long mini = Math.min(i , arr[i]) - 2;

                mini = Math.max(0 , mini);

                long curr = Math.max(prev , prev2 + mini);

                prev2 = prev;
                prev = curr;
            }

//            total damage (sum) - extra damage allowed of falling
//            - damage of each element except the base;
            System.out.println(damage-prev - (n-1));
        }

    }
}
