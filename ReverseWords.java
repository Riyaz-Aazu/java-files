package javaprograms;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen = "you. miss really am I";
		String [] words = sen.split(" ");
		String reversed = "";
		
		for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
		
		System.out.println("Original String : "+sen);
		
		System.out.println("Reversed String : "+reversed);


	}

}
