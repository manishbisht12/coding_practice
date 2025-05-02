import java.util.Scanner;

class L4 {
    
    static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // One number is missing, so actual count is length + 1
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (should be n - 1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers (from 1 to " + (size + 1) + ", with one missing):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissingNumber(arr);
        System.out.println("Missing number is: " + missing);
    }
}
