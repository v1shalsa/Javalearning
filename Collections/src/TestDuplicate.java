import java.util.*;
import java.util.Map;

public class TestDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,String> dupCheck = new HashMap<>();
		
		//Hashmap and Hashtable does not store duplicate data 
		
		dupCheck.put("Salvi", "Vishal");
		dupCheck.put("Salvi", "Nitin");
		dupCheck.put("Salvi", "Samuel");
		dupCheck.put("Salvi", "Deepak");
		dupCheck.put("Salvi", "Vilas");
		
		for(Map.Entry<String, String> entry :dupCheck.entrySet()) {
			System.out.println("Key :- "+entry.getKey()+" Value :- "+entry.getValue());
		}
	}

}
