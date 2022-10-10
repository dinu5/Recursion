package recursion;

public class DigitSum {
	static int total=0;

	public static void main(String[] args) {
		int n=345;
		sum(n);
		System.out.println(total);

	}
	
	static int sum(int n) {
		if(n==0)
			return 0;
		int rem=n%10;
		total+=rem;
		return sum(n/10);
	}

}
