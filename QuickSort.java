package recursion;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {23,6,10,33,5,30,44};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	static void quickSort(int[] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		int low=start;
		int high=end;
		int mid=start+(end-start)/2;
		int pivot=arr[mid];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
			quickSort(arr,start,high);
			quickSort(arr,low,end);
		}
	}

}
