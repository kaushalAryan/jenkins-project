
public class Palindrome 
{

	public static void main(String args[])
	{
	int n=Integer.parseInt(args[0]);
		
		int sum=0;
		int rem;
		int  temp;
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("number is palindrome");		
		}
		else
		{
			System.out.println("number is not palindrome");	
		}
		

	}

}
