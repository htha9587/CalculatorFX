package application;

/**
 * Version 0.4
 * @author htha9587
 * 6-3-16
 */


public class Model 
{
	/**
	 * Calculates for the number and operator buttons.
	 * @param number1
	 * @param number2
	 * @param Operator
	 * @return
	 */
	public float calculate(long number1, long number2, String Operator)
	{
		switch(Operator)
		{
		case "+":
			return number1 + number2;
		case "-":
			return number1 - number2;
		case "*":
			return number1 * number2;
		case "/":
			if(number2 == 0)
			return 0;
			return number1 / number2;
		
		default:
		
			return 0;
		}
		
		
	}
}
