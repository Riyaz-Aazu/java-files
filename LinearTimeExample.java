package javaprograms;

public final class LinearTimeExample {
	public static void printFirstElement(int[]arr) {
		for (int i = 0;i<arr.length;i++) {
			System.out.println("Element"+i+":"+arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers={10,20,30,40,50};
		printFirstElement(numbers);
		
	}	

}
