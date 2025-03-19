package concepts;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

            int left = 0, right = arr.length - 1;
	        
	        while (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            
	            left++;
	            right--;
	       
	        
	        System.out.println("Reversed array: " + Arrays.toString(arr));
            scanner.close();	        
	    }

	    
	        }
	    }
	


        
