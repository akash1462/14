import java.util.*;
public class linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			LinkedHashMap<String,Integer> bike = new LinkedHashMap<>();
			bike.put("Duke", 390);
			bike.put("Apache", 250);
			bike.put("r15", 125);
			
			System.out.println(bike);
			System.out.println("size :::"+bike.size());
			System.out.println("is it empty? :::"+bike.isEmpty());
			System.out.println("get value :::"+bike.get("Duke"));
			System.out.println("contains a :::"+bike.containsKey("a"));
			System.out.println("delete element :::"+bike.remove("r15"));
			System.out.println(bike);
			System.out.println("replace element :::"+bike.replace("Apache", 300));
			System.out.println(bike);
	}

}
