package recursion;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {2,1,5,34,22,54};
		int target=54;
		System.out.println(search(arr,target,0));
	}
	
	static boolean search(int[] arr,int target,int n) {
		if(n==arr.length)
			return false;
		return arr[n]==target || search(arr,target,n+1);
	}

}
