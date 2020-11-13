import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

HashSet<String> set = new HashSet<String>();
for (int i = 0; i < t; i++) {
    String fullName = pair_left[i] + " " + pair_right[i];
    set.add(fullName);
    System.out.println(set.size());
}  

    }
}