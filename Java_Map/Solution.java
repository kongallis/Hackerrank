import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map map=new HashMap();  
    
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            
            //Adding elements to map  
             map.put(name, phone);               
             
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            String result = s + "=" + map.get(s);
            System.out.println(map.get(s) != null ? result : "Not found");
		}
	}
}



