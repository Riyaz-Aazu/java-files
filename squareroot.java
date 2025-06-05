package javaprograms;
import java.util.Scanner;
public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sqrt = 0, start = 0, end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                sqrt = mid;
                break;
            } else if (mid * mid < n) {
                sqrt = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Integer part of square root: " + sqrt);
        scanner.close();

	}

}
