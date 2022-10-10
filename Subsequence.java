//abc: a,,b,c,ab,bc,ac,abc
//subsequence is for Strings
// Subset is for Arrays
package recursion;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		System.out.println(printSubRet("abc",""));

	}
	
	static void printSub(String s, String ans) {
		if(s.isEmpty())
		{
			System.out.println(ans+ " ");	
			return;
		}
		char ch=s.charAt(0);
		printSub(s.substring(1),ch+ans);
		printSub(s.substring(1),ans);
		
		
	}
	
	//---------------------------OR--------------------------------------
	
	static ArrayList<String> printSubRet(String s, String ans){
		if(s.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(ans);
			return list;
		}
		char ch=s.charAt(0);
		ArrayList<String> f=printSubRet(s.substring(1),ans+ch);
		ArrayList<String> l=printSubRet(s.substring(1),ans);
		
		f.addAll(l);
		
		return f;
		
	}

}
