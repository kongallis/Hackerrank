import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int division = 0;
        try {
            a = scanner.nextInt();
             b = scanner.nextInt();
                     
        try {
             division = a / b;
             System.out.println(division);
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        }
        
        } catch (java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        

    }
}