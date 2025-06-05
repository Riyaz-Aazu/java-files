package Tests;
import java.util.*;
public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int n = sc.nextInt();
		
		int orig = n;
		int sum = 0;
		while(n != 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		
		if (sum == orig) {
			System.out.println("This is a polindrome number");
		}
		else {
			System.out.println("This is not a polindrome number");
		}
		sc.nextLine();
		System.out.print("Enter the String to check :");
		String name = sc.nextLine();
		
		char word[] = name.toCharArray();
		boolean s = true;
		for(int i = 0, j = word.length - 1; i <= j; i++, j--) {
			if (word[i] != word[j]) {
				System.out.println("This is not a polindrome");
				s = false;
				break;
				
			}
		}
		
		if(s) {
			System.out.println("This is polindrome");
		}
		
		sc.close();
	}

}
