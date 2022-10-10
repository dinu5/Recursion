package recursion;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=278;
		System.out.println(reverse(n));
	}
	static int reverse(int n) {
		int power=(int)Math.log10(n);
		return helper(n,power);
	}
	
	static int helper(int n,int power) {
		if(n%10==n)
			return n;
		int rem=n%10;
		return rem*(int)Math.pow(10, power) + helper(n/10,power-1);
	}

}
