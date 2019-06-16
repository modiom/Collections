import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
	
public class Assignment2 {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the space separated strings");
Scanner sc = new Scanner(System.in);
String temp = sc.nextLine();
String input[] = temp.split(" ");
		Map<String,Integer> m = new HashMap<>();
		for(String str : input) {
			
				if(m.containsKey(str)) 
					m.put(str, m.get(str)+1);
				else
					m.put(str, 1);
		
		}
		
		m = m.entrySet()
        .stream()
        .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
        .collect(
            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                LinkedHashMap::new));
		
		System.out.println(m.keySet());
		sc.close();
	}

}
