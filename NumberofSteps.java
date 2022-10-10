package recursion;

public class NumberofSteps {

	public static void main(String[] args) {
		int n=123;
		System.out.println(numberOfSteps(n));

	}
	
	static int numberOfSteps(int num) {
		int count=0;
		return helper(num,count);
	}
	
	static int helper(int n,int c) {
		if(n==0)
			return c;
		if(n%2==0) {
			return helper(n/2,c+1);
					
		}
		else 
			return helper(n-1,c+1);
	}

}
