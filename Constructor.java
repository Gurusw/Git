
public class Constructor {
	private int a;
	private int b;

	Constructor()
	{
		System.out.println("This is one simple constructor printing");
	}
	Constructor(int a, int b)
	{
		this.a = a;
		this.b=b;
		
		
	}

	public static void main(String[] args) {
	Constructor a = new Constructor();

	}

}
