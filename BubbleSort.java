package recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	static void sort(int[] arr,int start, int end) {
		if(end==0)
			return;
		if(start<end && arr[start]>arr[start+1]) {
			swap(arr,start,start+1);
			sort(arr,start+1,end);
		}
		else 
			sort(arr,0,end-1);
	}
	
	static void swap(int[] arr,int i1, int i2) {
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
	}

}
