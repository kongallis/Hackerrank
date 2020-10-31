import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();
        int lineNumber = Integer.parseInt(sc.nextLine());
        String line;
        String[] splitNumbers;
        List<String[]> matrix = new ArrayList();     
        for (int i = 0; i < lineNumber; i++) {
            line = sc.nextLine();

            splitNumbers = line.split(" ");   
            matrix.add(i, splitNumbers);            
        }
        int askNumber = Integer.parseInt(sc.nextLine());
        int a;
        int b;
            for (int z = 0; z < askNumber; z++) {
            line = sc.nextLine();
            splitNumbers = line.split(" ");   
            a = Integer.parseInt(splitNumbers[0]);
            b = Integer.parseInt(splitNumbers[1]);

            if(matrix.get(a - 1).length > b) {
                System.out.println(matrix.get(a-1)[b]);
            } else {
                System.out.println("ERROR!");
            }            
        }

    }
}