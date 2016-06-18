import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            System.out.println(checkQuery(sc.nextInt()));
            
            
        }
    }
    
    public static int checkQuery(int N)
    {
        int y = (N-1) / 11;
        int j = 0;
        while(true)
        {
            String xx = (y * 11) + "";
            
            if(!xx.equals(new StringBuffer(xx).reverse().toString()))
            {   y--;
                continue;
            }
            for(int x = 10; x < 91; x++)
            {
                if(y % x == 0)
                {
                    j = y / x;  
                    if(j < 1000 && j > 99)
                        return y*11;
                }
            }
            y--;
            
        }

    }
}