import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Long T = sc.nextLong();
        
        for(Long i = 0L; i < T; i++)
        {
            Long first = 1L;
            Long Second = 2L;
            Long Sum = 0L;
            Long N = sc.nextLong();
            Long k = 0L;
            while(Second < N)
            {
                Sum = Sum + Second;
                k = Second;
                Second = Second + first;
                first = k;
                k = Second;
                Second = Second + first;
                first = k;
                k = Second;
                Second = Second + first;
                first = k;
            }    
        
            System.out.println(Sum);    
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}