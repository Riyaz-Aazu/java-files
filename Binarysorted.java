package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysorted {

    public static void main(String[] args) {
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};

        // Sort the array before binary search
        Arrays.sort(names);

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
