import java.util.Scanner;

public class L5 {

    static int count(int[] arr, int target){
        int n = arr.length;
        int ans =   0;

        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+ arr[j] == target){
                ans++;
            }
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.println("How many number in the array :");
        int size = sc.nextInt();

        int []arr = new int[size];

        System.out.println("Enter the numbers :");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Target:");
        int target = sc.nextInt();

        //System.out.println(count(arr, target));
        int result = count(arr, target);
        System.out.println("Output: " + result);
        sc.close();
    }
}


// Input: arr[] = {1, 5, 7, -1, 5}, target = 6
// Output:  3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).   