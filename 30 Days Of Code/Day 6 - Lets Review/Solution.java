import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            String s = sc.next();
            int length = s.length();
            for(int j = 0; j < length; j = j + 2)
                System.out.print(s.charAt(j));
            
            System.out.print(" ");
            
            for(int j = 1; j < length; j = j + 2)
                System.out.print(s.charAt(j));
            
            System.out.println();
        }
        
    }
}