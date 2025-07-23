package math;

import java.util.*;
public class Math577A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int x = sc.nextInt();
        int factor = 0;

        for(int i=1;i<=n;i++){
            if(x%i == 0){   //determining the factor of x
                if(x/i <= n)
                    factor++;
            }

        }
        System.out.println(factor);
//        }
    }
}
