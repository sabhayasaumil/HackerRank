import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] Player = new String[2];
        Player[0] = "Kitty";
        Player[1] = "Katty";
        
        int T = sc.nextInt();
        while(T>0)
        {
            int Q = sc.nextInt();
            int ans = 0;
            if(Q > 2)
                {
                    ans = Q%2;
            }
            System.out.println(Player[ans]);  
            T--;
        }
        
    }
}