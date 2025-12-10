import java.util.*;
public class findPairs {
    public static int evenpair(int n ,int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int col: arr){
            map.put(col ,map.getOrDefault(col, 0)+1);
        }
        int pairs =0;
        for(int fre :map.values()){
            pairs += fre/2;
        }
        return pairs;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result = evenpair(n,arr);
        System.out.println(result);
    }
}
