package recursion;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {3,1,5,4,2};
		selection(arr,0,1,arr.length-1);
		System.out.println(Arrays.toString(arr));


	}
	
	static void selection(int[] arr,int max,int start,int end) {
		if(end==0)
			return;
		if(start<=end && arr[max]<arr[start]) {
			max=start;
			selection(arr,max,max+1,end);
		}else if(start<=end && arr[max]>arr[start]){
			selection(arr,max,start+1,end);
			
		}
		else {
			int temp=arr[end];
			arr[end]=arr[max];
			arr[max]=temp;
			
			selection(arr,0,1,end-1);
		}
	}

}
