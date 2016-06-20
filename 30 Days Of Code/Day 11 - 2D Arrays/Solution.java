import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println(maxHourGlass(arr));
    }
    
    public static int maxHourGlass(int[][] arr)
    {
        int max = -1000;
        int sum = 0;
        
        int upperLimitofI = arr.length - 2;
        int upperLimitofJ = arr[0].length;
        
        if(upperLimitofJ <3)
            return 0;
        
        for(int i = 0; i < upperLimitofI; i++)
        {
            sum = arr[i][0] + arr[i][1] + arr[i][2] + arr[i+1][1] +arr[i+2][0] +arr[i+2][1] +arr[i+2][2];  
            
            for(int j = 3; j < upperLimitofJ; j++)
            {
                if(sum > max)
                    max = sum;
                sum = sum - arr[i][j-3] - arr[i+2][j-3] - arr[i+1][j-2] + arr[i][j] + arr[i+2][j] + arr[i+1][j-1];
            }
            
            
            if(sum > max)
                max = sum;
        }
        
        return max;
    }
}
