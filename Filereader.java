package New;
import java.io.*;

public class Filereader {
	public static void main(String[] args) {
		try {
			//File reader is the class used to read any kind of files 
			//Reads text from char files, reads each and every character untill reached the end of the file 
			//if EOF reached then it will return -1
			FileReader reader = new FileReader("C:\\Users\\vamsi\\OneDrive\\Desktop\\java.txt\\" );
			int ch;
			while ((ch = reader.read()) != -1) {
				
				System.out.println(ch + " - " +(char) ch);
			}
			reader.close();
		}catch(IOException e){
			System.out.print("Error: " + e.getMessage());
		}
	}

}
