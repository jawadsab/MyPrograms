package githubuploads;

import java.util.Scanner;

//#3 given low and high find all prime between low and high

public class Problem3 {
	
	static void primeRange(int low,int high)
	{
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
					System.out.print(i+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int low=scan.nextInt();
		int high=scan.nextInt();
		primeRange(low,high);

	}

}
