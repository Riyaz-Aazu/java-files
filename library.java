package javaprograms;
import java.util.TreeSet;
public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> bookIDs = new TreeSet<>();

        // Add Book IDs to the TreeSet
        bookIDs.add(5082);
        bookIDs.add(4998);
        bookIDs.add(5005);
        bookIDs.add(4999);
        bookIDs.add(5001);

        // Display results using TreeSet methods
        System.out.println("First book ID: " + bookIDs.first());
        System.out.println("Last book ID: " + bookIDs.last());
        System.out.println("ID just higher than 4999: " + bookIDs.higher(4999));
        System.out.println("ID just lower than 5005: " + bookIDs.lower(5005));
    }
}