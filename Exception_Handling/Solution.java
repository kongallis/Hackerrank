import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;

class MyCalculator {

    long power(int n, int p) throws java.lang.Exception{
        if (n < 0 || p < 0){
            throw new java.lang.Exception("n or p should not be negative.");       
        } else if (n == 0 && p == 0) {
            throw  new java.lang.Exception("n and p should not be zero.");
        } 
        double power = Math.pow(n, p);
        
        return (new Double(power)).longValue(); 
    }
    

}

public class Solution {