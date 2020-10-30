import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        BigInteger first  = new BigInteger(a);
        BigInteger second  = new BigInteger(b);
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));

    }
}