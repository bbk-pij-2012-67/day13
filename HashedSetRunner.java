import java.util.HashSet;
//import java.util.Iterator;

public class HashedSetRunner{
	
	public static void main(String[] args){
		
		HashSet<String> mySet = new HashSet<>();
		mySet.add("aaa");
		mySet.add("bbb");
		mySet.add("ccc");
		mySet.add("ddd");
		mySet.add("eee");
		mySet.add("fff");
		mySet.add("ggg");
		mySet.add("hhh");
		mySet.add("iii");
		mySet.add("aaa");
		mySet.add("bbb");
		mySet.add("ccc");
		mySet.add("ddd");
		mySet.add("eee");
		mySet.add("fff");
		mySet.add("ggg");
		mySet.add("hhh");
		mySet.add("iii");
		
		for (String item: mySet){
			System.out.println(item);
		}
	}
}
		
