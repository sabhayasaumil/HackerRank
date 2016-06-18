import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);      
		/* Declare second integer, double, and String variables. */
        i = i + scan.nextInt();

        d = d + scan.nextDouble();
        scan.nextLine();
        s = s + scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        System.out.println(i);
System.out.println(d);
System.out.println(s);
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}