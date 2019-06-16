import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class FrequencyCount {
	
	static void printMap(Map<Character,Integer>m) {

        m.forEach((k,v)->System.out.println(k + "	" + print(v)));
		
	}

	static String print(int v) {
		// TODO Auto-generated method stub
		String s = "";
		for(int i = 0;i<v;i++)
			s = s.concat("#");
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		Map<Character, Integer> freq = new TreeMap<>();
		for(Character temp : input.toUpperCase().toCharArray()) {
			if(((int)temp > 64 && (int)temp < 91)) {
				if(freq.containsKey(temp)) 
					freq.put(temp, freq.get(temp)+1);
				else
					freq.put(temp, 1);
					
			}
				
		}
		printMap(freq);
		
	}

}
