package contest1035;

import java.util.Scanner;

public class QuestionA {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(solve(a,b,x,y));
        }
    }
    private static int solve(int a , int b , int x, int y){

        if(a == b){
            return 0;
        }
        else if(a < b){

            if(x <= y){
                return (b-a) * x;
            }
            else{
                int sum = 0;

                for(int i=a;i<b;i++){
                    if(i%2 == 1){
                        sum+=x;
                    }
                    else
                        sum+=y;
                }
                return sum;
            }

        }
        else{

            if(a%2 == 1 && a-1 == b)
                return y;
            return-1;
        }
    }
}
