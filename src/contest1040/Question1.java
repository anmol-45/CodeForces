package contest1040;

import java.util.*;
public class Question1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();

            int zero = 0;
            int one = 0;
            int two = 0;
            int sum = 0;

            for(int i=0;i<n;i++){
                int ele =  sc.nextInt();

                if(ele == 0)
                    zero++;
                else if(ele == 1)
                    one++;
                else two++;

                sum += ele;

            }

            int rem = s - sum;

            if(rem >1 || rem == 0){
                System.out.println(-1);
            }
            else{

                solve(zero , one , two , rem);
            }
        }
    }
    private static void solve(int a , int b , int c , int rem){
        StringBuilder sb = new StringBuilder();

        sb.append("0 ".repeat(Math.max(0, a)));
        sb.append("2 ".repeat(Math.max(0, c)));
        sb.append("1 ".repeat(Math.max(0, b)));

        if (!sb.isEmpty()) sb.setLength(sb.length() - 1); // remove trailing space

        System.out.println(sb);
    }

}
