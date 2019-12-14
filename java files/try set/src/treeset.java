import java.util.TreeSet;
import java.util.Comparator;


class MyComparator implements Comparator<String>{
	public int compare(String str1, String str2){
		String first_str;
		String second_str;
		first_str = str1;
		second_str = str2;
		
		return second_str.compareTo(first_str);
	}
	
	
}
public class treeset {
	public static void main(String[] args){

        TreeSet<String> a = new TreeSet<String>(new MyComparator());
        a.add("apache 250");
        a.add("duke 125");
        a.add("duke 390");
        
        a.add("duke 390");
        
        System.out.println(a);
        
	}
}

//descending