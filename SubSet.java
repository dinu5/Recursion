package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSet {

	public static void main(String[] args) {
		int[] arr= {1,2,2};
		ArrayList<ArrayList<Integer>> ans=printSubDuplicates(arr);
		for(ArrayList<Integer> list : ans) {
			System.out.print(list+" ,");
		}

	}
	static ArrayList<ArrayList<Integer>> printSub(int[] arr){
		ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num : arr){
			int n=outer.size();
			for(int i=0;i<n;i++){
				ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		
		
		
		return outer;
	}
	
	static ArrayList<ArrayList<Integer>> printSubDuplicates(int[] arr){
		
		//if the array is {2,1,2} then it will not recognize whether the previous element is same or not
		Arrays.sort(arr);
		
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		
		outer.add(new ArrayList<Integer>());
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++) {
			start=0;
			int n=outer.size();
			// if current and previous element is same then it will add only the current list
			if(i>0 && arr[i]==arr[i-1]) {
				start=end+1;
			}
			end=outer.size()-1;
			for(int j=start;j<n;j++) {
				ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
				
			}
		}
		
		
		return outer;
	}

}
