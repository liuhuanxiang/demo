package behavioral.e_iterator;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AAA", "BBB", "CCC");
		List<String> strings = Arrays.asList("AAA", "BBB", "CCC");
		//ArrayList arrayList = new ArrayList<>("AAA", "BBB", "CCC");
		list.add("DDD");
		//Arrays.Arraylist
		for (String s : list) {
			System.out.println(s);
		}
		
	}
	
}
