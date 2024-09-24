
class computer
{
	public void PlayCricket()
	{
		System.out.println(" not played ");
	}
	public String Pen(int cost)
	{
		
		if (cost >=20)
		{
			return "pen";
			
		}
		else
		{
			return "nothing";
		}
		
	}
}
public class Object {
	public static void main(String[] args) 
	{
		computer guru = new computer();
		guru.PlayCricket();
		int cost;
		String obj = guru.Pen(cost = 20);
		System.out.println(obj);
				
		

	}

}
