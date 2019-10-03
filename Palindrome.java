



public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		
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
