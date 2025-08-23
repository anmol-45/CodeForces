package math;

import java.util.Scanner;

public class Math25A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int even = 0;
        int odd = 0;
        int evenCnt = 0;
        int oddCnt = 0;
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();

            if(ele % 2 == 0){
                even = i;
                evenCnt++;
            }
            else{
                odd = i;
                oddCnt++;
            }
        }
        if(evenCnt == 1){
            System.out.println(even+1);
        }
        else{
            System.out.println(odd+1);
        }
    }
}
