package binarySearch;

//C. Chamo and Mocha's Array
 import java.util.*;
public class Bs1975C {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n+1];


            for(int i=1;i<=n;i++){
                arr[i] = sc.nextInt();
            }

            if(n ==2){
                System.out.println(Math.min(arr[1] , arr[2]));
            }
            else{
                int ans = Math.min(arr[1] , arr[2]);

                for(int i=1;i<=n-2;i++){

                    List<Integer> temp = new ArrayList<>();
                    for(int j=0;j<3;j++){
                        temp.add(arr[i+j]);
                    }
                    Collections.sort(temp);
                    ans = Math.max(temp.get(1) , ans);
                }
                System.out.println(ans);
            }

        }

    }
}

