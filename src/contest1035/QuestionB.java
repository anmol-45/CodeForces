package contest1035;

import java.util.Scanner;

public class QuestionB {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long dist = (a-x)*(a-x) + (b-y)*(b-y);

            long s = 0, mx = 0;
            for(int i = 0; i < n; i++) {
                long ele = sc.nextLong();
                s += ele;
                mx = Math.max(ele, mx);
            }

            if(s*s < dist) {
                System.out.println("NO");
                continue;
            }

            long mn = Math.max(2*mx - s, 0L);
            if(mn*mn > dist) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
    }

}
