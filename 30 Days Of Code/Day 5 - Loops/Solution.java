import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       int N = new Scanner(System.in).nextInt();
        for(int i = 1; i < 11; i++)
            System.out.println(N + " x " + i + " = " + (N * i));
    }
}