package math;

import java.util.Scanner;

public class Math158B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int one = 0;
        int two = 0;
        int three = 0;
        int ans = 0;

        for(int i=0;i<n;i++){
            int ele = sc.nextInt();

            if(ele == 1){
                one++;
            }
            else if(ele == 2){
                two++;
            }
            else if(ele == 3){
                three++;
            }
            else{
                ans++;
            }
        }

        ans += two/2;
        two %=2;
        if(two == 1){
            if(one >1){
                ans++;
                one -=2;
            }
            else if(one == 1){
                one--;
                ans++;
            }
            else{
                ans++;
            }
        }

        ans += three;

        one -= three;

        if(one > 0){
            if(one % 4 != 0){
                ans ++;
            }
            ans += one/4;
        }
        System.out.println(ans);
    }
}
