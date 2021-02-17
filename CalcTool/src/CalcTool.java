
public class CalcTool {

	/**Multiple two Integer numbers**/
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	/**Divide two Integer numbers if divisor equals Zero -> Exception**/
	public float divide(int a, int b) throws Exception
	{
		if(b == 0)
		{
			throw new ArithmeticException("Divisor unequal 0");
		}
		else
		{
			return (float)a/b;			
		}
	}
	
	/**Sum two Integer numbers**/
	public int sum(int a,int b)
	{
		return a+b;
	}

	/**Sub two Integer numbers**/
	public int sub(int a,int b)
	{
		return a-b;
	}
}
