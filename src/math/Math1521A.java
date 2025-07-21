package math;

import java.util.Scanner;

public class Math1521A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b == 1){
                System.out.println("NO");

            }
            else{
                System.out.println("YES");
                System.out.println(a + " " + a*b + " "+ a*(b+1));
            }
        }
    }


}
