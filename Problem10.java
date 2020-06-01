package githubuploads;
//#10 Convert Decimal to Hex.

public class Problem10 {
	
	static void decToHex(int num)
	{
		
		char[] hex = new char[1000];
		int i=0;
		while(num!=0)
		{
			int digit = num%16;
			if(digit<10)
			{
				hex[i] = (char) (digit+48);
				i++;
			}else {
				hex[i] = (char)(digit + 55);
				i++;
			}
			num/=16;
			
		}
		 for(int j=i-1; j>=0; j--) 
	            System.out.print(hex[j]); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decToHex(1234);

	}

}
