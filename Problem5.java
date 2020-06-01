package githubuploads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//#5 given a number N print all factors of N in ascending order

public class Problem5 {
	
	static void factorsUpToN(int N)
	{
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=1;i*i<=N;i++)
		{
			if(N%i==0)
			{
				if(i==Math.sqrt(N))
				{
					array.add(i);
				}else {
					array.add(i);
					array.add(N/i);
				}
			}
		}
		Collections.sort(array);
		System.out.println("Factors upto "+N+" are");
		for(int i=0;i<array.size();i++)
		{
			System.out.print(array.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		factorsUpToN(N);
	}

}
