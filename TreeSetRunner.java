import java.util.TreeSet;

public class TreeSetRunner{
	
	public static void main(String[] args){
		
		TreeSet<String> mySet = new TreeSet<>();
		mySet.add("iii");
		mySet.add("hhh");
		mySet.add("ggg");
		mySet.add("fff");
		mySet.add("eee");
		mySet.add("ddd");
		mySet.add("ccc");
		mySet.add("bbb");
		mySet.add("aaa");
		mySet.add("iii");
		mySet.add("hhh");
		mySet.add("ggg");
		mySet.add("fff");
		mySet.add("eee");
		mySet.add("ddd");
		mySet.add("ccc");
		mySet.add("bbb");
		mySet.add("aaa");
		
		for (String item: mySet){
			System.out.println(item);
		}
	}
}
