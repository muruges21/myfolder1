package weee;

class dr
{
	static int count;
	dr()
	{
		count++;
	}
}

public class Ass {
	public static void main(String[] args) {
		dr d=new dr();
		System.out.println(dr.count);

}
}
