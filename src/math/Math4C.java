package math;

import java.util.*;
import java.util.Scanner;

public class Math4C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        List<String> names = new ArrayList<>();
        Map<String , Integer>  mp =  new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();


            if(mp.containsKey(s)){
                int repeat = mp.get(s);
                System.out.println(s.concat(Integer.toString(repeat)));
                mp.put(s , mp.get(s)  + 1);

            }
            else{
                mp.put(s , 1);
                System.out.println("OK");
            }
        }
    }

    private static String transformString(String str) {

        int idx = -1;
        for(int i=str.length()-1;i>=0;i--){
            char last = str.charAt(i);
            if(last  > '9'){
                idx = i;
                break;
            }
        }
        if(idx == str.length()-1){
            str = str + "1";
            System.out.println(str);
            return str;
        }
        else{
            String num = str.substring(idx+1);
            int n = Integer.parseInt(num);
            n = n+1;
            String ans = str.concat(Integer.toString(n));
            System.out.println(ans);
            return ans;
        }
    }
}

