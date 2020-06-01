package githubuploads;

public class Problem15 {
	static int getNthUglyNymber(int num)
	{
		int ugly[] = new int[num];  // To store ugly numbers 
        int two = 0, three = 0, five = 0; 
        int next_multiple_of_2 = 2; 
        int next_multiple_of_3 = 3; 
        int next_multiple_of_5 = 5; 
        int next_ugly_no = 1; 
		for(int i=1;i<num;i++)
		{
			next_ugly_no = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5)); 

			ugly[i] = next_ugly_no; 
			if (next_ugly_no == next_multiple_of_2) 
			{ 
			 two = two+1; 
			 next_multiple_of_2 = ugly[two]*2; 
			} 
			if (next_ugly_no == next_multiple_of_3) 
			{ 
			 three = three+1; 
			 next_multiple_of_3 = ugly[three]*3; 
			} 
			if (next_ugly_no == next_multiple_of_5) 
			{ 
			 five = five+1; 
			 next_multiple_of_5 = ugly[five]*5; 
			} 
					}
					return next_ugly_no;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 9; 
	        System.out.println(getNthUglyNymber(n)); 

	}

}
