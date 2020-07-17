import java.util.Scanner;
	public class NumberWord{
	 public static void main(String[] args)
	 {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			String[] word={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
			if(n<=9)
			{
			System.out.println(word[n]);
			}
			}
				
}
