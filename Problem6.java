package githubuploads;

import java.util.Scanner;

//#6 given a number N find all pairs of its prime factors as (prime factor, its freq)


public class Problem6 {
	
	static void printPrimeFactorPair(int num)
	{
		
		for(int i=2;i*i<=num;i++)
		{
			
			if(num%i==0)
			{
				int count = 0;
				while(num%i==0)
				{
					num/=i;
					count++;
				}
				System.out.println("( "+i+" ,"+count+" )");
			}
			
		}
		if(num !=1)
			System.out.println("( "+num+" , 1)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		printPrimeFactorPair(num);

	}

}
