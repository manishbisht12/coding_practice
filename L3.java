import java.util.Scanner;
import java.util.HashSet;
    //Pair with given Sum
public class L3 {
    public static boolean hasPairWithSum(int[] array, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : array) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true; 
            }
            seen.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element in the aaray:");
        int size = sc.nextInt();

        int[]array= new int[size];

        System.out.println("Enter"+size+"number :");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Target : ");
        int target = sc.nextInt();

        
        boolean result = hasPairWithSum(array, target);
        System.out.println("Output: " + result);

        sc.close();
       
       
    }
}



