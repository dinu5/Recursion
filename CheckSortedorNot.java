package recursion;

public class CheckSortedorNot {

	public static void main(String[] args) {
		int[] arr= {2,3,5,6,9};
		System.out.println(check(arr,0));

	}
	
	static boolean check(int[] arr,int n) {
		
		if(n==arr.length-1)
			return true;
		
		return arr[n]<arr[n+1] && check(arr,n+1);
		
	}

}
