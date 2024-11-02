package org.arthi_devops.arthi_unit_converter;
import java.util.Scanner;

public class App
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Choose conversion type:");
	        System.out.println("1. Length\n2. Weight\n3. Temperature");
	        int choice = scanner.nextInt();

	        System.out.println("Enter the value to convert:");
	        double value = scanner.nextDouble();
	        double result = 0;

	        if (choice == 1) 
	        {
	            System.out.println("Length Conversions:");
	            System.out.println("1. Feet to Meter\n2. Feet to Inch\n3. Feet to Mile\n4. Feet to Yard");
	            System.out.println("5. Meter to Inch\n6. Meter to Mile\n7. Meter to Yard\n8. Inch to Mile\n9. Inch to Yard\n10. Vice Versa");
	            int lengthChoice = scanner.nextInt();

	            if (lengthChoice == 1) result = value * 0.3048;
	            else if (lengthChoice == 2) result = value * 12;
	            else if (lengthChoice == 3) result = value / 5280;
	            else if (lengthChoice == 4) result = value / 3;
	            else if (lengthChoice == 5) result = value * 39.3701;
	            else if (lengthChoice == 6) result = value / 1609.34;
	            else if (lengthChoice == 7) result = value * 1.09361;
	            else if (lengthChoice == 8) result = value / 63360;
	            else if (lengthChoice == 9) result = value / 36;
	            else if (lengthChoice == 10) 
	            {
	                System.out.println("Select vice versa conversion:");
	                System.out.println("1. Meter to Feet\n2. Inch to Feet\n3. Mile to Feet\n4. Yard to Feet\n5. Inch to Meter\n6. Mile to Meter\n7. Yard to Meter\n8. Mile to Inch\n9. Yard to Inch");
	                int viceLengthChoice = scanner.nextInt();
	                if (viceLengthChoice == 1) result = value / 0.3048;
	                else if (viceLengthChoice == 2) result = value / 12;
	                else if (viceLengthChoice == 3) result = value * 5280;
	                else if (viceLengthChoice == 4) result = value * 3;
	                else if (viceLengthChoice == 5) result = value / 39.3701;
	                else if (viceLengthChoice == 6) result = value * 1609.34;
	                else if (viceLengthChoice == 7) result = value / 1.09361;
	                else if (viceLengthChoice == 8) result = value * 63360;
	                else if (viceLengthChoice == 9) result = value * 36;
	            }

	        } 
	        else if (choice == 2) 
	        {
	            System.out.println("Weight Conversions:");
	            System.out.println("1. Gram to Pound\n2. Gram to Ounce\n3. Gram to Carat\n4. Pound to Ounce\n5. Pound to Carat\n6. Ounce to Carat\n7. Vice Versa");
	            int weightChoice = scanner.nextInt();

	            if (weightChoice == 1) result = value / 453.592;
	            else if (weightChoice == 2) result = value / 28.3495;
	            else if (weightChoice == 3) result = value * 5;
	            else if (weightChoice == 4) result = value * 16;
	            else if (weightChoice == 5) result = value * 2267.96;
	            else if (weightChoice == 6) result = value * 141.748;
	            else if (weightChoice == 7) 
	            {
	                System.out.println("Select vice versa conversion:");
	                System.out.println("1. Pound to Gram\n2. Ounce to Gram\n3. Carat to Gram\n4. Ounce to Pound\n5. Carat to Pound\n6. Carat to Ounce");
	                int viceWeightChoice = scanner.nextInt();
	                if (viceWeightChoice == 1) result = value * 453.592;
	                else if (viceWeightChoice == 2) result = value * 28.3495;
	                else if (viceWeightChoice == 3) result = value / 5;
	                else if (viceWeightChoice == 4) result = value / 16;
	                else if (viceWeightChoice == 5) result = value / 2267.96;
	                else if (viceWeightChoice == 6) result = value / 141.748;
	            }

	        } 
	        else if (choice == 3) 
	        {
	            System.out.println("Temperature Conversions:");
	            System.out.println("1. Celsius to Kelvin\n2. Celsius to Fahrenheit\n3. Kelvin to Fahrenheit\n4. Vice Versa");
	            int tempChoice = scanner.nextInt();

	            if (tempChoice == 1) result = value + 273.15;
	            else if (tempChoice == 2) result = (value * 9/5) + 32;
	            else if (tempChoice == 3) result = (value - 273.15) * 9/5 + 32;
	            else if (tempChoice == 4) 
	            {
	                System.out.println("Select vice versa conversion:");
	                System.out.println("1. Kelvin to Celsius\n2. Fahrenheit to Celsius\n3. Fahrenheit to Kelvin");
	                int viceTempChoice = scanner.nextInt();
	                if (viceTempChoice == 1) result = value - 273.15;
	                else if (viceTempChoice == 2) result = (value - 32) * 5/9;
	                else if (viceTempChoice == 3) result = (value - 32) * 5/9 + 273.15;
	            }
	        }

	        System.out.println("Converted value: " + result);
	        scanner.close();
	    }
	
}
