import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcToolTest {

	private CalcTool calc;
	
	@BeforeEach
	public void setUp() throws Exception
	{
		calc = new CalcTool();
	}
	
	/*Test for multiply two Integer Numbers*/
	@Test
	@DisplayName("Simple multiplication should work")
	public void testMultiply()
	{
		assertEquals(30, calc.multiply(5, 6),"Multiple with two nums should work");
	}
	
	/*Test for sum two Integer Numbers*/
	@Test
	@DisplayName("Simple Addition should work")
	public void testSum()
	{
		assertEquals(11, calc.sum(5, 6),"Sum two nums should work");
	}
	
	/*Test for sub two Integer Numbers*/
	@Test
	@DisplayName("Simple Subtraction should work")
	public void testSub()
	{
		assertEquals(4, calc.sub(10, 6),"Sub two nums should work");
	}
	
	/*Test for multiply two Integer Numbers*/
	@Test
	@DisplayName("Simple Divison should work")
	public void testDivision() throws Exception
	{
		assertEquals(2.5, calc.divide(15, 6),"Divided two nums should work");
	}
	
	/*Test for multiply two Integer Numbers*/
	@Test
	@DisplayName("Divided Zero should throw Exception")
	public void testDivisonZero() throws Exception
	{
		Assertions.assertThrows(ArithmeticException.class,() -> calc.divide(5,0));
	}
	@Test
	@DisplayName("Handling Multiplication with Zero")
	public void testMultiplyWithZero()
	{
		assertEquals(0,calc.multiply(0, 5), "Multiple with zero should be zero");
	}
}
