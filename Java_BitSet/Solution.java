import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parameters = sc.nextLine().split(" ");
        int N = Integer.parseInt(parameters[0]);
        int M = Integer.parseInt(parameters[1]);
        // System.out.println(N + "   " + M);
        BitSet B1 = new BitSet(M);
        BitSet B2 = new BitSet(M);
    //     for (int i = 0; i < M; i++) {
    //         B1.set(0, true);
    //         B2.set(i+1, false);
    //     }
        
    //   System.out.println("Initial pattern in B1: ");
    //   System.out.println(B1);
    //   System.out.println("Initial pattern in B2: ");
    //   System.out.println(B2);
    String action;
    int arg1;
    int arg2;
    String data[];
    for (int j = 0; j < M; j++) {
        data = sc.nextLine().split(" ");
        action = data[0];
        arg1 = Integer.parseInt(data[1]);
        arg2 = Integer.parseInt(data[2]);
        takeAction(action, arg1, arg2, B1, B2);
    }
    
    
    
    }
    
    private static void takeAction(String action, int arg1, int arg2, BitSet B1, BitSet B2) {
        
        if (action.equals("AND")) {
            if(arg1 == 1)
                B1.and(B2);
            else
                B2.and(B1);            
        } else if (action.equals("SET")) {
            if(arg1 == 1)
                B1.set(arg2);
            else
                B2.set(arg2);  
            
        } else if (action.equals("FLIP")) {
            if(arg1 == 1)
                B1.flip(arg2);
            else
                B2.flip(arg2);  
        } else if (action.equals("OR")) {
            if(arg1 == 1)
                B1.or(B2);
            else
                B2.or(B1);  
            
        } else if (action.equals("XOR")) {
            if(arg1 == 1)
                B1.xor(B2);
            else
                B2.xor(B1);  
            
        }
        System.out.println(B1.cardinality()+" "+B2.cardinality());
    }
}
