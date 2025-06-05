package javaprograms;
import java.util.TreeSet;
import java.util.Comparator;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> employeeNames = new TreeSet<>(Comparator.reverseOrder());

        // Add employee names
        employeeNames.add("Sumit");
        employeeNames.add("Karan");
        employeeNames.add("Anjali");
        employeeNames.add("Mohan");
        employeeNames.add("Zoya");

        // Display names in reverse order
        System.out.println("Employee names in reverse alphabetical order:");
        for (String name : employeeNames) {
            System.out.println(name);
        }

	}

}
