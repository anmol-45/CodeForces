package math;

import java.util.Scanner;

//B. MIN = GCD
public class Math2084B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {



            int n = sc.nextInt();


            int mini = -1;
            long miniEle = Long.MAX_VALUE;
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                long ele = sc.nextLong();

                if(ele <= miniEle){
                    miniEle = ele;
                    mini = i;
                }
                arr[i] = ele;

            }

            long g = 0;
            for(int i=0;i<n;i++){
                if(i != mini && arr[i] % arr[mini] == 0){
                    g = findGcd(g , arr[i]);
                }
            }

            if(g == miniEle){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
    private static long findGcd(long a , long b){
        if(b == 0)
            return a;
        return findGcd(b , a%b);
    }

}
