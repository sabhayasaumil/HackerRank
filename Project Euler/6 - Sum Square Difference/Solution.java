import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long T = sc.nextLong();
        for(Long i=0L; i < T; i++)
            System.out.println(calculateSumDiff(sc.nextLong()));
    }
    
    public static Long calculateSumDiff(Long X)
    {
            return (X * (X+1)*(3*X*X - X - 2))/12;
    
    }
}