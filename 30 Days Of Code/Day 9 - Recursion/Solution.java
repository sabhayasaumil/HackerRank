import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Factorial(new Scanner(System.in).nextInt()));
    }
    
    public static int Factorial(int X)
    {
        if(X < 2)
            return 1;
        return Factorial(X-1)*X;
    }
}