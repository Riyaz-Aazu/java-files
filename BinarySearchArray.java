package javaprograms;
public class BinarySearchArray {

	public static void main(String[] args) {
		int [] arr= {2,4,6,8,10,12,15};
		int target=10;
		int result=binarySearch(arr,target);
		if(result!=-1) {
			System.out.println("Element found at index:"+result);
		}else {
			System.out.println("Element not found at index iin array:");
		}
	}
	public static int binarySearch(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		int result=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				result=mid;
				right=mid-1;
			}else if(arr[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return result;
	}
}
