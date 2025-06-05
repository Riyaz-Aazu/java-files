package App;

import java.util.*;

public class ToDoListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		boolean flag = false;
		
		while(true) {
			System.out.println("\n\n");
			System.out.println("---------------------------------------");
			System.out.println("|	Simple To-Do-List app         |");
			System.out.println("|	1.Add a task                  |");
			System.out.println("|	2.View a task                 |");
			System.out.println("|	3.Delete a task               |");
			System.out.println("|	4.Exit                        |");
			System.out.println("---------------------------------------");
			
			System.out.println("Enter the choice from 1 - 4: ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				System.out.print("Enter the task name: ");
				String task = sc.nextLine();
				list.add(task);
				break;
				
			case 2:
				System.out.println("TO-DO: ");
				for(int i = 0; i < list.size(); i++) {
					System.out.println("Task "+ (i+1) +": " +list.get(i));
				}
				
				if(list.size() == 0) {
					System.out.println("No task to view");
				}
				break;
				
			case 3:
				if(list.size() == 0) {
					System.out.println("No task to delete");
					break;
				}
				System.out.println("These are the task you have to do: ");
				for(int i = 0; i < list.size(); i++) {
					System.out.println("Task "+ (i+1) +": " +list.get(i));
				}
				
				System.out.print("Enter the task num to delete: ");
				int tn = sc.nextInt();
				list.remove(tn - 1);
				System.out.println("\nTasks are deleting an element: ");
				for(int i = 0; i < list.size(); i++) {
					System.out.println("Task "+ (i+1) +": " +list.get(i));
				}
				break;
				
			case 4:
				System.out.println("Exitting from the Application");
				flag = true;
				break;
			default:
				System.out.println("Enter valid number");
				
			}
			if(flag) {
				break;
			}
		}
		
		sc.close();

	}

}
