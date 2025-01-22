package variable;

public class Variable {

	public static void main(String[] args) {
		
		// How to Declare Variable
		// it can do like next line 
		// Type VariableName = Value;
		// Variable Naming Convention => camel Case
		
		// Primitive Type 
		// Variable type  
		// Integer => byte[1B] => short[2B] => int[4B] => long[8B]; 
		// long has suffix like this attach l to end 
		byte byteVariable = 127;
		short shortVariable = 3454;
		int intVariable = 765765;
		long longVariable = 1000l;
		
		// fractional numbers 실수형 변수 
		// float[4B] => double[8B]
		// float has suffix like this attach f to end
		float floatVariable = 1.324f;
		
		// And d has suffix but its default Value by declaring Variable 
		// it have to attach d to end
		// it doesn't matter you use what you want
		double doubleVariable1 = 3.44;  
		double doubleVariable2 = 3.44d;
		
		// boolean[1B] 
		// it doesnt have suffix;
		// it can only have true or false;
		// 참 or 거짓
		// 
		boolean booleanVariable1 = true;
		boolean booleanVariable2 = false;
		
		// char[2B]
		// charactor Variable stores a single character.
		// char using single quotes (')
		// it can declare by using unicode or int Value;
		char charVariable1 = 'A'; // charactor
		char charVariable2 = 65; // int Value
		char charVariable3 = '\u0041'; // unicode
		
		System.out.println(charVariable1);
		System.out.println(charVariable2);
		System.out.println(charVariable3);
		
		
		
		
		

	}

}
