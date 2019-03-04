package pageload;

public class ST {
	
	static StringBuffer sb=new StringBuffer("satish");
	public static void main(String args[]) {
		
		String s = "satish";

		System.out.println(s.hashCode());

		s = s + "hello";
	
		System.out.println(s.hashCode());
		System.out.println(s);
		
		//String buffer
		
		
		System.out.println(sb.hashCode());
		
		Thread t1=new Thread();
		
		t1.run();
	
		
		System.out.println(sb);
		sb.reverse();
		
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
	}
	public static void fun(){
		sb=sb.append("who are you");
	}
}
