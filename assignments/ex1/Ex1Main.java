package assignments.ex1;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";

        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println("Ex1 class solution:");
            System.out.println();
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            int num1Int=-1, num2Int=-1 ;
            if (!num1.equals("quit")) {
                boolean isNumber= Ex1.isNumber(num1);
                num1Int= Ex1.number2Int(num1);
                System.out.println("num1=" +num1+ " is number:" +isNumber+", value:" +num1Int);
                if (!isNumber) {
                    continue;
                }
            }
            else break;

            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (!num2.equals("quit")) {
                boolean isNumber= Ex1.isNumber(num2);
                num2Int= Ex1.number2Int(num2);
                System.out.println("num2=" +num2+ " is number:" +isNumber+", value:" +num2Int);
                if (!isNumber) {
                    continue;
                }
            }
            else break;

            System.out.println("Enter a base for output: (a number [2,16]  ");
            String base = sc.next();
            int baseInt=-1;
            try {
                baseInt= Integer.parseInt(base);
                if( baseInt>16 || baseInt<2 ) {
                    System.out.println("Invalid base number");
                    continue;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid base number");
                continue;
            }

            int sum= num2Int + num1Int;
            int mul= num2Int*num1Int;
            String sumStr= Ex1.int2Number(sum,baseInt);
            String mulStr= Ex1.int2Number(mul,baseInt);
            System.out.println( num1+"+" +num2 + "="+ sumStr);
            System.out.println(num1+"*" +num2 + "="+mulStr);
            String[] arr ={num1,num2,sumStr,mulStr};
            int maxIndex= Ex1.maxIndex(arr);
            System.out.println("Max number over ["+num1+","+num2+","+sumStr+","+mulStr+"]"+"is:"+arr[maxIndex]);

        }
        System.out.println("quiting now...");
    }
}
