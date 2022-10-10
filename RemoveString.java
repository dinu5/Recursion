package recursion;

public class RemoveString {

	public static void main(String[] args) {
		String s="isapphita";
		System.out.println(removeAppNotApple(s));

	}
	
	static String removeAppNotApple(String s) {
		if(s.isEmpty())
			return "";
		//this will ignore app but not when it is apple
		if(s.startsWith("app") && !s.startsWith("apple")) {
			return removeAppNotApple(s.substring(3));
		}else {
			return s.charAt(0) + removeAppNotApple(s.substring(1));
		}
	}

}
