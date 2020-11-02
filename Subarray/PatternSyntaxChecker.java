import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The length of the input array is given
        int length = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Creating the array
        String[] array = sc.nextLine().split(" ");

        int negativeArrays = 0;
        int sum = 0;
        // First loop:
        for (int i = 0; i < length; i++) {
            for (int z = i; z < length; z++){
                sum += Integer.parseInt(array[z]);
                if (sum < 0) {
                    negativeArrays++;
                }
            }
            sum = 0;
        }
        System.out.println(negativeArrays);
    }
}