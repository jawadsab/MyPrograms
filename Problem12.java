package githubuploads;

public class Problem12 {
	
	static int e_gcd(int num1,int num2) {
		return num2==0 ? num1 : e_gcd(num2, num1%num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(e_gcd(400,12));

	}

}
