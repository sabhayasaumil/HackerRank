import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        
        for(int i = 0; i < N; i++)
            ar[i] = sc.nextInt();
        
        int noOfQ = sc.nextInt();
        
        for(int i = 0; i < noOfQ; i++)
            {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int ans = ar[A-1];

                if( A > B || (A < ar.length && ar[A] == 0 && A < B))
                    ans = 1;
                    
                if((ans % 2) == 1)
                    System.out.println("Odd");
                else
                    System.out.println("Even");
        }
    }
}