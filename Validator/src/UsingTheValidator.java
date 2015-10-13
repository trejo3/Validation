import java.util.Scanner;
import myTools.Validator;

public class UsingTheValidator {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = input.next();
		
		int age = Validator.getInt(input, "Enter age: ", 1, 100);
		
		int height = Validator.getInt(input, "Enter height: ", 36, 92);
		
		int weight = Validator.getInt(input, "Enter weight: ", 80, 400);
		
		double favDec = Validator.getDouble(input, "Enter favorite decimal: ", 0, 1);
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Favorite Decimal: " + favDec);
	}
}
