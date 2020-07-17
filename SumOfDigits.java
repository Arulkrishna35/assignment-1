import java.util.Scanner;
public class SumOfDigits
{
public static void main(String arg[])
{
int n,sum=0,a=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
n=sc.nextInt();
int m=n;
for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
int k=sum;
if(sum>10)
{
	for(a=0;sum!=0;sum/=10)
	{
		a+=sum%10;
	}
System.out.println(m+"-"+k+"-"+a);
}
else
{
	System.out.println(m+"-"+sum);
}
}
}