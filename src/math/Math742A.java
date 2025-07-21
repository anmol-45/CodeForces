package math;

import java.util.*;

//742A - Arpa’s hard exam and Mehrdad’s naive cheat
public class Math742A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int ans;
        if(t%4 == 1)
            ans = 8;
        else if(t%4 == 2)
            ans = 4;
        else if(t%4 == 3)
            ans = 2;
        else{
            ans = 6;
        }
        System.out.println(ans);

    }

}