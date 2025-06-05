package javaprograms;

public class binarysearch {

    public static void main(String[] args) {
        // Sorted array for binary search
        int[] numbers = {2, 5, 6, 7, 9}; 
        int target = 0;  // You can change this to test other values
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                System.out.println("Found " + target + " at index " + mid);
                found = true;
                break;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println(target + " not found in the array.");
        }
    }
}
