import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++)
            findMultiple(sc.nextInt());
    }
    
    public static void findMultiple(int X)
    {
        int mult = 1;
        int rem, rem1;
        int y;
        for(; X > 1; X--)
        {
            if(mult % X != 0)
            {
                y = 1;
                rem = mult % X;
                rem1 = rem;
                while(rem != 0)
                {
                    y++;
                    rem = (rem1 * y) % X;
                }
                
                mult = mult * y;
            }
        }
        
        System.out.println(mult);
    }
}