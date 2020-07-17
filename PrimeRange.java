
public class PrimeRange{
 
    public static void main(String[] args)
    {
		int n=2,tem=0;
		while(n<=100)
		{
			tem=0;
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
				{
					tem++;
				}
			 
			} 
			if(tem==2)
			{
				System.out.println(n);
			}
			n++;
			
		}
    }
}