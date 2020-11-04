import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfList = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> list = new ArrayList();
        // Add values to the list
        for (int i = 0; i < sizeOfList; i++) {
            list.add(sc.nextInt());
        }
        
        int numberOfQueries = sc.nextInt();
       
        String typeOfQuery;
        for (int i = 0; i < numberOfQueries; i++) {
            typeOfQuery = sc.next();             
            
            if (typeOfQuery.equals("Insert")) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                list.add(a, b);
            } else if (typeOfQuery.equals("Delete")) {
                int c = sc.nextInt();
                list.remove(c);
            }
        }
        for (int el : list) {
            System.out.print(el + " ");
        }

    }
}
