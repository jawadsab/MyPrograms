package githubuploads;

import java.util.Scanner;

//31/05/2020


//#1 given a number return true if its prime else false;

public class Problem1 {
	
	static void isPrime(int num)
	{
		if(num<0) return;
		if(num<=1) {
			System.out.println(num+" is not prime");
			return;
		}
		
		boolean isPrime=true;
		
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPrime(num);

	}

}
