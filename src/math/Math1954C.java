package math;


import java.util.*;
public class Math1954C {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            String x = sc.next();
            String y = sc.next();

            char[] xArr = x.toCharArray();
            char[] yArr = y.toCharArray();

            int n = xArr.length;
            boolean f = false;
            for (int i = 0; i < n; ++i) {
                if ((xArr[i] > yArr[i]) == f) {
                    char temp = xArr[i];
                    xArr[i] = yArr[i];
                    yArr[i] = temp;
                }
                f |= (xArr[i] != yArr[i]);
            }
            System.out.println(new String(xArr));
            System.out.println(new String(yArr));
        }
    }
}
