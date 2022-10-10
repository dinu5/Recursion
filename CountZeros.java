package recursion;

public class CountZeros {

	public static void main(String[] args) {
		int n=205670300;
		System.out.println(count(n));

	}
	
	static int count(int n) {
		int c=0;
		return helper(n,c);
	}
	
	static int helper(int n,int c) {
		if(n%10==n)
			return c;
		int rem=n%10;
		if(rem==0)
			return helper(n/10,c+1);
		else
			return helper(n/10,c);
	}

}
