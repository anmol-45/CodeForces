package math;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

//C. Penchick and BBQ Buns
public class Math2031C {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            if(n%2 == 1){
                if(n >= 27){
                    int cnt = 2;
                    int val = 0;
                    for(int i=1;i<=22;i++){
                        if(i == 1 || i == 10){
                            System.out.print(1 + " ");
                        }
                        else{
                            System.out.print(cnt + " ");
                            val++;
                        }
                        if(val == 2){
                            val = 0;
                            cnt ++;
                        }
                    }
                    System.out.print("12 13 13 1 12 ");

                    n -= 27;
                    cnt = 14;
                    val = 0;
                    for(int i=0;i<n;i++){
                        System.out.println(cnt + " ");
                        val++;

                        if(val == 2){
                            cnt++;
                            val = 0;
                        }
                    }
                }
                else{
                    System.out.println(-1);
                }
            }
            else{
                for(int i=1;i<=(n/2);i++){
                    System.out.print(i +" ");
                    System.out.print(i +" ");
                }
            }
            System.out.println();
        }
    }
}
