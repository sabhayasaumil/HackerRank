import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long k;        
        for(int i = 0; i < T; i++)
            {
                k = sc.nextLong();
                int j = calcJ(k);
                int p = calcI(k);
                int v = (j*p)%10;
                System.out.println(v);
            }
    }
    
    public static int calcI(long n)
        {
            
            Double d = (Math.log(n)/ Math.log(2));
            int k = d.intValue();
        
            if(k == 0)
                return 2;

            return (k%5) * 6;
    }
    
    public static int calcJ(long n)
        {
            if(n%2 == 0)
                return 1;
            return 5;
    }
}