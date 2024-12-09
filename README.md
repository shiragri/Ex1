Ex1
This assignment focuses on the foundation of function programming and testing, it covers Strings, arrays, and numerical computations.
In this assignment, we will design a number formatting converter and calculator.
In general, we will use Strings as numbers over the base of binary till Hexa (2-16), 10-16 are represented by A,B,..G.
The general representation of the numbers is as a String with the following format: <number><b><base> 
e.g., “135bA” (i.e., “135”), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”. 
The following are NOT in the format: 
“b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, “”, null.


In this code, we built the following functions:
-number2Int(String num): Convert the input to its decimal value 
-isNumber(String a): Check if the input is in the right format.
-int2Number(int num, int base): Convert decimal number to format in base between 2-16
-equals(String n1, String n2): Compare string values
-maxIndex(String[] arr): Finding the Greatest Value in the Array

