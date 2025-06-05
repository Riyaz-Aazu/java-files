package Tests;
import java.util.*;
public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for(int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		
		sc.close();

	}

}
