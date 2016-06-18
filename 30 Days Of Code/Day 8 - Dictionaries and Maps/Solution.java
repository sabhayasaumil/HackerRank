//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap map = new HashMap();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            Integer phone = in.nextInt();
            // Write code here
            map.put(name, phone);
            
            
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phoneNo = (Integer)map.get(s);
            if(phoneNo == null)
                System.out.println("Not found");
            else
                System.out.println(s+"="+phoneNo);
            // Write code here
        }
        in.close();
    }
}
