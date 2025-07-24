package virtualContest.round81;

//B. Left and Down

import java.util.Scanner;

public class LeftAndDown {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();

            long gcd = findGcd(a , b);
            long div1 = a/gcd;
            long div2 = b/gcd;
            if(div1<=k && div2 <=k){
                System.out.println(1);
            }
            else
                System.out.println(2);

        }
    }
    private static long findGcd(long a , long b){
        if(b == 0)
            return a;
        return findGcd(b , a%b);
    }

}

