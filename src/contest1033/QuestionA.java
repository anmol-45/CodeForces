package contest1033;

import java.util.Scanner;

public class QuestionA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int l1 = sc.nextInt();
            int b1 = sc.nextInt();
            int l2 = sc.nextInt();
            int b2 = sc.nextInt();
            int l3 = sc.nextInt();
            int b3 = sc.nextInt();

            String ans = "NO";
            int area = l1*b1 + l2*b2 + l3*b3;

            int a = (int) Math.sqrt(area);

            if(area != a*a){
                System.out.println(ans);
            }
            else{
                //case 1:
                if((l1+l2+l3) == a && b1 == b2 && b2 == b3 && b1 == a){
                    ans = "YES";
                }
                //case 2:
                if((b1 +b2+b3) == a && l1 == l2 && l2 == l3 && l1 == a){
                    ans = "YES";
                }

                //case 3:
                if(l2 == l3 && l1 + l2 == a && b2+b3 == b1 && b2+b3 == a ){
//                    int side = b2+b3;
//                    if(side == b1 && side == a)
                        ans = "YES";
                }

                //case 4

                if(b2 == b3 && b1 + b2 == a && l2+l3 == l1 && l2+l3 == a){
//                    int side = l2 + l3;
//                    if(side == l1 && side == a){
                        ans = "YES";
//                    }
                }
                System.out.println(ans);
            }
        }
    }
}
