import java.util.Scanner;
class TableMulti
{
	int a;
	void multi(int a)
	{
		this.a = a;
		for(int i=1;i<=100;i++)
		{
			System.out.println(i+" * "+a+" = "+(i*a));
		}
	}
}
public class MultiTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for MultiplicationTable..: ");
		int a=sc.nextInt();
		TableMulti mul = new TableMulti();
		mul.multi(a);
	}
}

