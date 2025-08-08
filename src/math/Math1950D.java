package math;

import java.util.*;

//D. Product of Binary Decimals
public class Math1950D {

    static List<Integer> precompute = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for(int i=2;i<100007;i++){
            int curr = i;
            boolean flag = false;

            while(curr > 0){
                if(curr%10 > 1){
                    flag = true;
                    break;
                }
                curr/=10;
            }

            if(flag)
                precompute.add(i);

        }

        for (int i = 2; i < 100007; i++) {
            int curr = i;
            boolean bad = false;
            while (curr > 0) {
                if (curr % 10 > 1) {bad = true; break;}
                curr /= 10;
            }
            if (!bad) {precompute.add(i);}
        }

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            String ans = solve(n) ? "YES" : "NO";
            System.out.println(ans);
        }
    }

    private static boolean solve(int n){
        //check if n is even and doesn't contain 0 at last

        if(n ==1 )
            return true;

        boolean ans = false;
        for (Integer integer : precompute) {
            if (n % integer == 0) {
                ans |= solve(n / integer);
            }
        }
        return ans;
    }
}

