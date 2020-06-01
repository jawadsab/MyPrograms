package githubuploads;

//#8 Convert Binary to Decimal. Input is Binary as string. Return decimal is Integer.

public class Problem8 {
	
	static void binToDec(String str)
	{
		int dec=0;
		int base=1;
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			if(str.charAt(i)=='1')
			{
				dec+=base;
			}
			base*=2;
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binToDec("11");

	}

}
