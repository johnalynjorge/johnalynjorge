import java.util.Scanner;
public class LabExer1B
{
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print ("Enter an integer: ");
		int a = s.nextInt();
		showNumberPlus10(a);
		showNumberPlus100(a);
		showNumberPlus1000(a);
		//Hello
}
static void showNumberPlus10(int n)
{
	int sum = 10 + n;
	System.out.println (n + " plus 10 is " + sum);
}
static void showNumberPlus100(int n)
{
	int sum = 100 + n;
	System.out.println (n + " plus 100 is " + sum);
}
static void showNumberPlus1000(int n)
{
	int sum = 1000 + n;
	System.out.println (n + " plus 1000 is " + sum);
}
}
