import java.util.Scanner;
public class SumDigits{
	public static void main(String arg[])
	{
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n!=0)
	{
		sum+=n%10;
		n=n/10;
	}
	System.out.println("SUM OF DIGITS:" + sum);
	}
}

