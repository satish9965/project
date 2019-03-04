package pageload;

import java.util.ArrayList;
import java.util.Collections;

public class Demoarraylist {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("satish");
		list.add("abubakar");
		list.add("mahesh");
		list.add("krishna");
		
		System.out.println(list);
		
		//reverse
		Collections.reverse(list);
		System.out.println(list);
		
		//sorting
		Collections.sort(list);
		System.out.println(list);
	}

}
