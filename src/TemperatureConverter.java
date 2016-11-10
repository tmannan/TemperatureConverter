import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperature = 0.0;
		double result = 0.0;
		int conversiontype;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter conversion type, for C to F, enter 1, for F to C enter 2");
		conversiontype = keyboard.nextInt();
		switch (conversiontype)
		{
		case 1:
			System.out.println("Enter temperature in C");
			temperature = keyboard.nextDouble();
			result = toF(temperature);
			break;
		case 2:
			System.out.println("Enter temperature in F");
			temperature = keyboard.nextDouble();
			result = toC(temperature);
			break;
		default:
			System.out.println("entered wrong conversion type");
			break;
		}
		System.out.println("input temp: " + temperature + " converted value: " + result);
	}

public static double toC(double temp)
{
	double cVal=0;
	cVal = (5.0/9.0) * (temp-32);
	return cVal;
}

public static double toF(double temp)
{
	double fVal=0;
	fVal = temp * 9/5 + 32;
	return fVal;
}
}
