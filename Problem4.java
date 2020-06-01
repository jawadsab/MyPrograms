package githubuploads;

import java.util.Scanner;

//  #4 given low and high find sum of all primes
public class Problem4 {
	
	static int sumOfPrimes(int low, int high)
	{
		int sum = 0;
		
		if(low<=1 && high>=2)
		{
			low = 2;
		}
		if(high<2)
		{
			System.out.println("No prime numbers");
		}else {
			
			for(int i=low;i<=high;i++)
			{
				boolean flag = true;
				for(int j=2; j*j<=i;j++)
				{
					if(i%j==0)
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					sum+=i;
				}
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int low = scan.nextInt();
		int high = scan.nextInt();
		
		
		System.out.println(sumOfPrimes(low, high));

	}

}
