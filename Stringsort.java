package javaprograms;

import java.util.Arrays;
import java.util.Scanner;
public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		String []names= {"riyaz","sanifa","kutty","aiza","azmin"};
		System.out.println("before sort");
		for(String sr:names) {
			System.out.println(sr+" ");
			
		}
		Arrays.sort(names);
		System.out.println("after sort");
		for(String st:names) {
			System.out.println(st+" ");
			
		}
	}

}