package math;

//C. Earning on Bets
import java.util.*;
public class Math1979C {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];


            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            solve(arr , n);
        }
    }

    private static void solve(int[] arr, int n) {

        long lcm = 1;

        for(int i=0;i<n;i++){
            lcm = findLcm(lcm ,(long) arr[i]);
        }
//        System.out.println(lcm);

        long sum = 0;

        for(int i=0;i<n;i++){
            sum += lcm/arr[i];
        }

        if(sum >= lcm){
            System.out.println(-1);
        }
        else{
            for(int i=0;i<n;i++){
                System.out.print(lcm/arr[i] + " ");
            }
            System.out.println();
        }
    }

    private static long findLcm(long a , long b){
        long gcd = findGcd(a , b);
        return (a*b)/gcd;
    }

    private static long findGcd(long a , long b){
        if(b == 0)
            return a;

        return findGcd(b , a%b);
    }
}

