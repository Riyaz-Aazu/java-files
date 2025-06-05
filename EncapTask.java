package Tests;

import java.util.*;

class Students{
	private int roll, marks;
	private String name;
	
	public void set_info(int roll,int marks, String name) {
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	public int get_roll() {
		return roll;
	}
	
	public int get_marks() {
		return marks;
	}
	
	public String get_name() {
		return name;
	}
	
	public void display_info() {
		System.out.println("Name: "+ name);
		System.out.println("Roll no: "+ roll);
		System.out.println("Marks: "+ marks);
	}
}

public class EncapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the name of the student: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the roll of student: ");
		int roll = sc.nextInt();
		
		
		System.out.print("Enter the marks of the student: ");
		int marks = sc.nextInt();
		
		st.set_info(roll, marks, name);
		
		if(st.get_marks() > 40) {
			System.out.println("The Student has passed the exams");
		}
		else {
			System.out.println("The student has failed in the exam session");
		}
		
		sc.close();
		

	}

}
