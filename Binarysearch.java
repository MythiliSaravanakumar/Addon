package concepts;
import java.util.Scanner;


public class Binarysearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the ele: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the ele (sorted): ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.print("Enter target ele: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not Found .");
        } else {
            System.out.println("index: " + result);
        }

        scanner.close();
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high)/ 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
       
    }
        }
