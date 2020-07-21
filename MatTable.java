import java.util.Scanner;
public class MatTable{
public static void main(String[] args){
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter last number");
int n=sc.nextInt();
System.out.println("Enter the operator");
char ch=sc.next().charAt(0);
switch(ch)
{
	case '*':
	{
		for(int i=1;i<=n;i++)
		{
			int p=a*i;
		System.out.println(a+" * "+ i +" = "+ p);
		

		}
		break;		
	}
	case '+':
	{
		for(int i=1;i<=n;i++)
		{
			int m=a+i;
			System.out.println(a+" + "+ i +" = "+ m);
			
		
	}
	break;
	}
case '-':
{
	for(int i=1;i<=n;i++)
	{
		int k=a-i;
		System.out.println(a+" - "+ i +" = "+ k);

	}
	break;
}
default:
{
	break;
}
	}

	}
}