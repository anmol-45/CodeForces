package contest1038;

import java.util.Scanner;

public class QuestionB {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long sum = 0;
            for(int i=0;i<n;i++){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                long d = sc.nextLong();

                if(b > d){
                    sum += a + (b-d);
                }
                else if(a > c){
                    sum += (a - c);
                }
            }
            System.out.println(sum);


        }
    }
}
