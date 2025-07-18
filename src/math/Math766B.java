package math;
import java.util.*;

//B. Mahmoud and a Triangle
public class Math766B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //upper bound of a+b to be found withing array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }

        System.out.println(solve(arr, n));

    }
    private static String solve(int[] arr , int n){
        int i = 0;
        int j = 1;

        while(j < n-1){
            if(arr[i] + arr[j] <= arr[j+1]){
                i++;
                j++;
            }
            else{
                return "YES";
            }
        }
        return "NO";
    }
}