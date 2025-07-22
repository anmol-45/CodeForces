package math;

import java.util.*;

//A. Ksusha and Array
public class Math299A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k == 0){
            System.out.println("YES");
            return;
        }
        boolean[] prime = new boolean[n+1];


        Arrays.fill(prime, true); // Assume all are prime
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

//        for(int i=0;i<=n;i++)
//            System.out.println(prime[i]);

        int i = 2;
        int cnt = 0;
        boolean flag = false;
        for(int j = 3;j<=n;j++){
            if(cnt >= k){
                flag = true;
                break;
            }
            if(prime[j]){
                int ele = i+j+1;
                if(ele >n){
                    break;
                }
                if(prime[ele])
                    cnt++;
                i = j;
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
