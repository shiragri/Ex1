Ex1
This assignment focuses on the foundation of function programming and testing, it covers Strings, arrays, and numerical computations.
In this assignment, we will design a number formatting converter and calculator.
In general, we will use Strings as numbers over the base of binary till Hexa (2-16), 10-16 are represented by A,B,..G.
The general representation of the numbers is as a String with the following format: <number><b><base> 



In this code, we built the following functions:
-number2Int(String num): Convert the input to its decimal value 
-isNumber(String a): Check if the input is in the right format.
-int2Number(int num, int base): Convert decimal number to format in base between 2-16
-equals(String n1, String n2): Compare string values
-maxIndex(String[] arr): Finding the Greatest Value in the Array

What does the code do?
Receives the first string from the user, and prints if it is in the correct format, and what is its decimal value
Receives a second string from the user, and prints if it is in the correct format, and what is its decimal value
Receives a base from the user between 2-16
Connects the values of the first and second string and converts to the base you want
Multiplies the values of the first and second string and converts to the base you want
Finds the largest value in the array in which the initial strings are located, their addition and multiplication and prints the string

Example of good inputs: “135bA” (i.e., “135”), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”. 
The following are NOT in the format: 
“b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, “”.

Example of a run:
Enter a string as number#1 (or "quit" to end the program): 
234bG
num1=234bG is number:true, value:564
Enter a string as number#2 (or "quit" to end the program): 
1011b2
num2=1011b2 is number:true, value:11
Enter a base for output: (a number [2,16]  
16
234bG+1011b2=23fbG
234bG*1011b2=183cbG
Max number over [234bG,1011b2,23fbG,183cbG]is:183cbG


