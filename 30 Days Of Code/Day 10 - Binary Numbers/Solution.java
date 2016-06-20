import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int max = 0;
        int counter = 0;
        while(N > 0)
        {
            if(N % 2 == 1)
            {
                counter++;
            }
            
            else
            {
                if(counter > max)
                    max = counter;
                counter = 0;
            }
            
            N = N / 2;
            
        }
        
        if(counter > max)
            max = counter;
        
        System.out.println(max);
        
    }
}