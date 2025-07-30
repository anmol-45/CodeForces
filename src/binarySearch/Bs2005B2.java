package binarySearch;


//need optimization
import java.util.*;
public class Bs2005B2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();

            int[] arr = new int[m];
            int[] queries = new int[q];


            for(int i=0;i<m;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<q;i++){
                int d = sc.nextInt();
                System.out.println(solve(d, arr, m, n));
            }
        }

    }

    private static int solve(int d , int[] arr, int m , int n) {
        int k = findBound(arr , d , m);


        if (k == 0) return arr[0] - 1 ;          // case 1
        else if (k == m) return  n - arr[m - 1]; // case 2
        else return (arr[k] - arr[k - 1]) / 2;    // case 3

    }

    private static int findBound(int[] arr, int d, int n) {

        int low = 0;
        int high = n;

        while(low<high){
            int mid = low + (high-low)/2;

            if(arr[mid] > d){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}

