package math;

import java.util.Scanner;

public class Math1326A {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            if(n == 1){
                System.out.println(-1);
            }
            else{
                System.out.print("23");
                for(int i=3;i<=n;i++){
                    System.out.print("9");
                }
                System.out.println();
            }
        }
    }


}
