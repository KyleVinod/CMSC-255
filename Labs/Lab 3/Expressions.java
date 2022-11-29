public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c));       
    
	/*************************************
	* Because ++ started first, it's a preincrement. The a variable will increase to 4 and the new value will be used in the statement
	*************************************/
	System.out.println("#3 " + (++a));  
	
	/*************************************
	* Because -- started first, it's a predecrement. The a variable will decrease to 3 and the new value will ve used in the statement
	*************************************/
    System.out.println("#4 " + (--a));
	
	/*************************************
	* It's a postincrement, so a variable will increase to 4 although original value will be used in statement
	*************************************/
    System.out.println("#5 " + (a++));  

	/*************************************
	* It's a postdecrement, so a variable will decrease to 3 but original value will be used in statement
	*************************************/
    System.out.println("#6 " + (a--));
	
	/*************************************
	* 3 will get a sum of 1
	* The value is 4
	*************************************/
    System.out.println("#7 " + (a + 1));    

	/*************************************
	* 17 is MOD by 5 to give a remainder of 2
	* The value is 2
	*************************************/
    System.out.println("#8 " + (d % c));       
	
	/*************************************
	* 17 is divided by 5 with integer division
	* The value is 3
	*************************************/
    System.out.println("#9 " + (d / c));       
	
	/*************************************
	* 17 is MOD by 4 to give remainder
	* The value is 1
	*************************************/
    System.out.println("#10 " + (d % b));   

	/*************************************
	* 17 is divided by 4 with integer division
	* The value is 4
	*************************************/
    System.out.println("#11 " + (d / b));       
	
	/*************************************
	* Division has higher precedence, so 3 divided by 17 with integer division will give 0
	* 17, 0, and 4 are added together
	* The value is 21
	*************************************/
    System.out.println("#12 " + (d + a / d + b));       
	
	/*************************************
	* Parenthese have higher precedence, so 17 + 3 equals 20 and 17 + 4  equals 21
	* 20 is divided by 21 with integer division
	* The value is 0
	*************************************/
    System.out.println("#13 " + ((d + a) / (d + b)));  

	/*************************************
	* It's asking for the square root of 4 and will be returned in doubled
	* The value is 2.0
	*************************************/
    System.out.println("#14 " + (Math.sqrt(b)));    

	/*************************************
	* It's asking for 3 to the power of 4 and will be returned in doubled
	* The value is 81.0
	*************************************/
    System.out.println("#15 " + (Math.pow(a, b)));       
	
	/*************************************
	* It's asking for the absolute value of -3
	* The value is 3
	*************************************/
    System.out.println("#16 " + (Math.abs(-a)));
	
	/*************************************
	* It's asking for the maximum of 3 and 4
	* The value is 4
	*************************************/
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
}
