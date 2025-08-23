package math;

import java.util.Scanner;

public class Math1932B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int prev = arr[0];
            for(int i=1;i<n;i++){

                prev = (prev + arr[i])/arr[i] * arr[i];
//                int ele = arr[i];
//                int cnt = 2;
//
////                ele = 200;
//                while(ele <= prev){
//                    int temp = ele * cnt;
//                    if(temp > prev){
//                        ele = temp;
//                        break;
//                    }
//                    cnt++;
//                }
//                prev = ele;
            }
            System.out.println(prev);
        }
    }
}

