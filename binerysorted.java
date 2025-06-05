package javaprograms;
import java.util.Arrays;
import java.util.Scanner;
public class binerysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};

	        // Create Scanner for user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a name to search: ");
	        String inputName = scanner.nextLine();

	        // Perform binary search
	        int index = Arrays.binarySearch(names, inputName);

	        // Check result
	        if (index >= 0) {
	            System.out.println(inputName + " found at index " + index + ".");
	        } else {
	            System.out.println(inputName + " not found in the list.");
	        }

	        scanner.close();

	}

}
