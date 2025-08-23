package contest1043;

import java.util.Scanner;

public class QuestionA {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            String a = sc.next();
            int m = sc.nextInt();
            String b = sc.next();

            String seq = sc.next();

            StringBuilder sv = new StringBuilder(a);

            String ans = "";

            for(int i=0;i<seq.length();i++){
                if(seq.charAt(i) == 'D'){
                    sv.append(b.charAt(i));
                }
                else if(seq.charAt(i) == 'V'){
                    String ch = Character.toString(b.charAt(i));

                    ans = ch.concat(ans);

                }
            }

            System.out.println(ans + sv.toString());

        }


    }
}
