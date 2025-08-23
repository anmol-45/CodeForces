package contest1033;

import java.util.Scanner;

public class QuestionC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long m = sc.nextLong();
            
            if( m < n || m > ((long) n *(n+1)/2)){
                System.out.println("-1");
            }
            else{
                int[] arr = new int[n];
                long rem= ((long) n * (n + 1) / 2) - m;
                
                for(int i=0;i<n;i++){
                    arr[i] = i+1;
                }

                for(int i=n-1;i>=0;i--){
                    if(rem <= arr[i]-1){
                        arr[i] -= rem;
                        rem = 0;
                    }
                    else{
                        rem -= (arr[i] - 1);
                        arr[i] = 1;
                    }

                    if(rem <= 0)
                        break;
                }

                //printing part

                int root = Integer.MIN_VALUE;

                for(int i=0;i<n;i++){
//                    System.out.print(arr[i] + " ");
                    root = Math.max(root , arr[i]);
                }
//                System.out.println();

                System.out.println(root);
                for(int i=0;i<n;i++){
                    if(arr[i] == i+1){
                        if(i+1 == root)continue;

                        System.out.println(i+1 + " " + root);
                    }
                    else{
                        System.out.println(i+1 + " " + arr[i] );
                    }
                }

            }
            
        }
    }
}

