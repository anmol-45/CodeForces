package math;

import java.util.Scanner;

public class Math1925B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int n = sc.nextInt();

            int quo = x;

            for(int i=1;i*i<=x;i++){

                if(x%i != 0)
                    continue;
                if(i >= n)
                    quo = Math.min(quo , i);

                if(x/i >= n)
                    quo = Math.min(quo , x/i);
            }

            System.out.println(x/quo);
        }
    }
}

