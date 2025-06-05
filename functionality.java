package javaprograms;
import java.util.Scanner;
import java.util.TreeSet;
public class functionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> products = new TreeSet<>();
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        products.add("CPU");
        products.add("Webcam");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter product name
        System.out.print("Enter product name to search: ");
        String input = scanner.nextLine();

        // Check if product exists in the set (case insensitive)
        if (products.contains(input)) {
            System.out.println(input + " found.");
        } else {
            System.out.println(input + " not found.");
        }

        scanner.close();
		
		

	}

}
