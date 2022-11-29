public class VariableDefinitions
{
	public static void main(String [] args)
	{
		/*************************************
		* initial declaration of itemPrice variable
		*************************************/
		double itemPrice = 32.32;
		
		/*************************************
		* initial declaration of classNum variable
		*************************************/
		short classNum = 207;
		
		/*************************************
		* initial declaration of bigNum variable
		*************************************/
		long bigNum = 990123456789L;
		
		/*************************************
		* initial declaration of smallNum variable
		*************************************/
		int smallNum = 177609;
		
		System.out.println("The itemPrice variable has a value of " + itemPrice);
		System.out.println("The classNum variable has a value of " + classNum);
		System.out.println("The bigNum variable has a value of " + bigNum);
		System.out.println("The smallNum variable has a value of " + smallNum);
		
		/*************************************
		* modified value of the itemPrice variable
		*************************************/
		itemPrice = 35.15;
		
		/*************************************
		* modified value of the classNum variable
		*************************************/
		classNum = 300;
		
		/*************************************
		* modified value of the bigNum variable
		*************************************/
		bigNum = 932749374935L;
		
		/*************************************
		* modified value of the smallNum variable
		*************************************/
		smallNum = 125682;
		
		System.out.println("The itemPrice variable now has a value of " + itemPrice);
		System.out.println("The classNum variable now has a value of " + classNum);
		System.out.println("The bigNum variable now has a value of " + bigNum);
		System.out.println("The smallNum variable now has a value of " + smallNum);
		
		/*************************************
		* initial declaration of the price constant
		*************************************/
		final double price = 25.12;
		
		/*************************************
		* initial declaration of the balls constant
		*************************************/
		final byte balls = 23;
		
		/*************************************
		* initial declaration of the numFood
		*************************************/
		final int numFood = 8276;
		
		/*************************************
		* initial declaration of the fruit constant
		*************************************/
		final long fruit = 846272495723L;
		
		/*************************************
		*balls = 25;, this caused an error to the constant and the code wouldn't run
		*************************************/
		
	}
}
