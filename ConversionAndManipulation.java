import java.text.DecimalFormat;

public class ConversionAndManipulation {
    
    public static void main(String[] args) {
        
        // **1. Converting from Numbers to Strings**
        int num = 1234;
        // Converting number to string
        String numStr = Integer.toString(num);
        System.out.println("Number to String: " + numStr);

        // **2. Converting from Strings to Numbers**
        String strNum = "5678";
        int convertedNum = Integer.parseInt(strNum); // Convert string back to integer
        System.out.println("String to Number: " + convertedNum);

        // **3. Formatting Number Output**
        double decimalNum = 1234.56789;
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Formats to two decimal places
        System.out.println("Formatted Number: " + decimalFormat.format(decimalNum));

        // **4. Using Static Constants and Methods in Math Class**
        // Math.PI is a static constant representing the value of π
        double areaOfCircle = Math.PI * Math.pow(5, 2); // Area of a circle with radius 5
        System.out.println("Area of Circle: " + areaOfCircle);

        // Math.sqrt is a static method that calculates the square root
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square Root of 25: " + sqrtValue);

        // **5. Character and Character Class**
        char ch = 'A';
        System.out.println("Is Character Uppercase? " + Character.isUpperCase(ch)); // Checks if character is uppercase
        System.out.println("Lowercase: " + Character.toLowerCase(ch)); // Converts to lowercase

        // **6. String Manipulation - Reversing a String**
        String originalString = "Hello, Java!";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);

        // **7. Autoboxing and Unboxing**
        Integer boxedInt = num; // Autoboxing: int to Integer
        int unboxedInt = boxedInt; // Unboxing: Integer to int
        System.out.println("Autoboxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
    }

    /**
     * This method reverses a given string using StringBuilder.
     *
     * @param str the string to be reversed
     * @return the reversed string
     */
    public static String reverseString(String str) {
        // StringBuilder allows easy manipulation of strings
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); // reverse() reverses the string, and toString() converts it back to a string
    }
}
