package test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) throws IOException { 
		Map<String, Integer> map = new TreeMap<>();
		String filePath = "e:/a.java";   
		Scanner scanner = new Scanner(Paths.get(filePath));    
		scanner.useDelimiter("[^a-zA-Z]+");     
		while (scanner.hasNext("[a-zA-Z]+")) {    
			String s = scanner.next();       
			Integer count = map.get(s);
			if(count == null) count = 0;
			count = count + 1;
			map.put(s, count);
		}    
		scanner.close(); 
		
		for(String s : map.keySet())
			System.out.printf("%s %d\n", s, map.get(s));
	} 

}
