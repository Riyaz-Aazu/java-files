package javaprograms;
import java.util.Scanner;

public class lineasearch {

	public static void main(String[] args) {
		// TODO Auto-gene,,,rated method stub
		int[] numbers= {5,6,7,9,2,};
		int target =9;
		boolean found=false;
		for(int i=0; i<numbers.length;i++){
			if(numbers[i]==target) {
				System.out.println("Found"+" "+target+" at index"+" "+ i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Number not found");
		}

	}

}
