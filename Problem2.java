package githubuploads;

import java.util.Scanner;

//#2 given a number N find all primes less than N;

public class Problem2 {

	static void primeUpToN(int N)
	{
		if(N<=1)
		{
			System.out.println("No prime numbers");
			return;
		}
		//boolean array to mark each number upto N+1
		boolean[] mark = new boolean[N+1];
		for(int i=2;i<N; i++)
		{
			mark[i]=true;
		}
		//start i from first prime number
		for(int i=2;i*i<=N;i++)
		{
			//if a i is prime mark all its factors false
			if(mark[i]==true)
			{
				for(int j=i*i;j<N;j+=i)
				{
					mark[j]=false;
				}
			}
		}
		//print prime numbers 
		for(int i=2;i<N;i++)
		{
			if(mark[i]==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		primeUpToN(N);
		
		
		

	}

}
