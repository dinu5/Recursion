package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		int n=5;
		System.out.println(findNumber(n));
	}
	static int findNumber(int n) {
		if(n<2) {
			return 1;
		}
		return findNumber(n-1) + findNumber(n-2);
	}

}
