import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        for(long i = 0L; i < T; i++)
        {
            long number = sc.nextLong();
            number--;
            long x = number / 3;
            long result = 3 * x *(x + 1) / 2;
            
            x = number / 5;
            result = result + ((5 * x * (x + 1)) / 2);
            
            
            x = number / 15;
            result = result - (15* x*(x+1) / 2);
            System.out.println((result));
                
        }
        
    }
}