package math;

import java.util.*;

//B. Scenes From a Memory

public class Math1562B {

    static Scanner sc = new Scanner(System.in);

    private static void solve(){
        int n = sc.nextInt();
        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '1' || ch == '4' || ch == '6' || ch == '8' || ch == 9){
                System.out.println(1);
                System.out.println(ch);
                return;
            }
            else{
                sb.append(ch);
            }
        }

        String str = sb.toString();
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int ele = Integer.parseInt("" + str.charAt(i) + str.charAt(j));
                for (int x = 2; x * x <= ele; x++) {
                    if (ele % x == 0) {
                        System.out.println(2);
                        System.out.println(ele);
                        return;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        int t = sc.nextInt();
        while (t-- > 0) {

            //if the number is 1 4 6 8 9 then its answer is 1
            //if any number is repeating itself in a sequence then the ans is 2
            //if any number which doesnt starts with 2 or 5 but has these two then ans is 2

            solve();
        }
    }

}