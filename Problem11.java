package githubuploads;

public class Problem11 {
	
	static int e_gcd(int a,int b)
	{
		while(b!=0)
		{
			int rem = a%b;
			a=b;
			b=rem;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(e_gcd(3,12));

	}

}
