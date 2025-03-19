package concepts;
import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);

        sc.close();
    }
}
