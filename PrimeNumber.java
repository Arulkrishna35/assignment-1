import java.util.Scanner;
public class PrimeNumber{
 
    public static void main(String []args)
    {
		int n,tem=0;
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
             if(n%i==0)
			 {
				 tem++;
			 }
			 
        } 
		if(tem==2)
		{
			System.out.print("PRIME NUMBER");
		}
		else
		{
			System.out.print("NOT A PRIME NUMBER");
		}
		
    }
}