package recursion;

public class RemoveChar {

	public static void main(String[] args) {
		String s="abcadaf";
		System.out.println(remove2(s));
	}
	static void remove(String s, String removed) {
		if(s.length()==1) {
			if(s.charAt(0)!='a')
			System.out.println(removed+s.charAt(0));
			else
				System.out.println(removed);
			return;
		}
		int i=0;
		
		if(s.charAt(i)!='a') {
			removed=removed+s.charAt(i);
			remove(s.substring(i+1),removed);
		}else {
			remove(s.substring(i+1),removed);
		}
	}
	//--------------OR-----------------------
	static String remove2(String s) {
		if(s.isEmpty()) {
			return "";
		}
		char ch=s.charAt(0);
		if(ch=='a') {
			return remove2(s.substring(1));
		}else {
			return ch + remove2(s.substring(1));
		}
	}

}
