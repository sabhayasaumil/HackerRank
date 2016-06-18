import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Long T = sc.nextLong();
        
        for(Long i = 0L; i < T; i++)
        {
            System.out.println(findMaxPrime(sc.nextLong()));    
            
        }
        
    }
    
    public static long findMaxPrime(Long N)
    {
        if(N < 4)
            return N;

        Long maxPrime = 2L;
        
        while(N % maxPrime == 0)    
                    N = N / maxPrime;   
        
        Long L = 1L;
        Long m, k;
        Double d = Math.sqrt(N);
        k = d.longValue();
        maxPrime = N;
        while(L <= k)
        {
            L = L + 2;
            m = N;
   
            while(N % L == 0)
                N = N / L;
            if(N != m)
            {
                maxPrime = L;
                d = Math.sqrt(N);
                k = d.longValue();
            }
        }
    
        if(N > 1)
            return N;
        
        return maxPrime;
        
        
    }
}