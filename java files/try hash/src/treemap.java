import java.util.TreeMap;
public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> bike = new TreeMap<String, Integer>();
		bike.put("Duke", 390);
		bike.put("Apache", 200);
		System.out.println(bike.entrySet());
		
		System.out.println("desc:::" +bike.descendingMap());
	}

}


//by default ascending order