package concepts;

	import java.util.Scanner;
	import java.util.Arrays;
	public class RotateArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];

	        System.out.println("Enter array elements: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter number of rotations: ");
	        int n = sc.nextInt();

	        rotateLeft(arr, n);
	        
	        System.out.println("Rotated Array: " + Arrays.toString(arr));
	        
	        sc.close();
	    }

	    static void rotateLeft(int[] arr, int n) {
	        int len = arr.length;
	        n = n % len;
	        int[] temp = new int[n];
	        System.arraycopy(arr, 0, temp, 0, n);
	        System.arraycopy(arr, n, arr, 0, len - n);
	        System.arraycopy(temp, 0, arr, len - n, n);
	    }
	}



