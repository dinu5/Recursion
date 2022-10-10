package recursion;

import java.util.ArrayList;

public class FindAllIndexes {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int[] arr= {2,1,5,51,34,22,5,54};
		int target=5;
//		System.out.println(find(arr,target,0,list));
		System.out.println(find2(arr,target,0));

	}
	
	static ArrayList<Integer> find(int[] arr,int target,int index,ArrayList<Integer> list){
		
		
		if(index==arr.length)
			return list;
		if(arr[index]==target) {
			list.add(index);
			
		}
		
		return find(arr,target,index+1,list);
		
	}
	
//-----------------------------OR----------------------------------------------------------
	
	static ArrayList<Integer> find2(int[] arr,int target,int index){
		ArrayList<Integer> list=new ArrayList<>();
		if(index==arr.length)
			return list;
		
		if(target==arr[index]) {
			list.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls = find2(arr,target,index+1);
		list.addAll(ansFromBelowCalls);
		return list;
		
		
	}

}
