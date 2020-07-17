import java.util.Scanner;
public class Range{
 
    public static void main(String []args)
    {
		int n,m;
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 m=sc.nextInt();
        for(int i=n+1; i<=m; i++)
        {
                System.out.println(i+" ");
        } 
         
    }
}