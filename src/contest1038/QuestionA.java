package contest1038;


import java.util.Scanner;

public class QuestionA {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == 1 || m == 1){
                System.out.println("NO");
            }
            else if(n == 2 && m == 2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
