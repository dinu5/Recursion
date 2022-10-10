package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {2,5,7,9,11,34,67};
		int target=5;
		System.out.println(search(arr,target,0,arr.length-1));

	}
	static int search(int[] arr,int target, int start, int end) {
		int mid= start + (end-start)/2;
		
		if(start>end) {
			return -1;
		}
		else if(arr[mid]==target) {
			return mid;
		}
		else if(target<arr[mid]) {
			return search(arr,target,start,mid-1);
		}
		else {
			return search(arr,target,mid+1,end);
		}
		
	}

}
