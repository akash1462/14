import java.util.HashMap;
//import java.util.Map;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map = new HashMap<>();
		System.out.println(map);
		map.put("Duke", 390);
		map.put("r15", 250);
		map.put("Apache", 200);
		
		System.out.println("Size of map is : " +map.size());
		
		System.out.println(map);
		
		if(map.containsKey("Duke")){
			Integer a = map.get("Duke");
			System.out.println("value for key:"+a);
		}
		
		map.clear();
		System.out.println(map);
		
		
	}

}
