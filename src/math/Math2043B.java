package math;

//B. Digits
import java.util.*;
public class Math2043B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            System.out.print(1 + " ");

            for(int i=3;i<=9;i+=2){
                boolean flag = true;
                int num = d;
                int k = 1;
                while(num%i != 0){
                    num = num * 10;
                    num += d;
                    k++;
                    if(k >= i+1){
                        flag = false;
                        break;
                    }
                }

                if(!flag)continue;
                if(n>=k) {
                    System.out.print(i + " ");
                }
                else{
                    //find n factorial and check
                    int prod = 1;
                    for(int j=1;j<=n;j++){
                        prod *=j;
                    }
                    if(prod%k == 0){
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
