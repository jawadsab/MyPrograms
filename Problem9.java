package githubuploads;

//#9 Convert Decimal to Binary. Input is Decimal Num as int. Return binary as String.

public class Problem9 {
	
	static void decToBin(int num)
	{
		if(num==0)
		{
			System.out.println("0");
			return;
		}
		StringBuilder str = new StringBuilder("");
		while(num!=0)
		{
			int digit = num%2;
			str.append(Integer.toString(digit));
			num/=2;
		}
		System.out.println(str.reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decToBin(2);

	}

}
