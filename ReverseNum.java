import java.util.Scanner;
public class ReverseNum{
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n, reversed = 0, rdr, original;
		n=sc.nextInt();
        original = n;
        while( n!=0 )
        {
            rdr = n% 10;
            reversed= reversed*10+rdr;
            n/= 10;
        }
        System.out.println(reversed);
    }
}