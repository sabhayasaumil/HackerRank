import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++)
            check(sc.next(), sc.next());
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
    public static void check(String s1, String s2)
        {
        
                if(s1.matches(".*["+s2+"].*"))
                {            
                    System.out.println("YES");
                    return;
                }
            System.out.println("NO");
        
        }
}