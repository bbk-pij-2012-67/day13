import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;

public class LinkedListRunner{
	
	public static void main(String[] args){
		
		LinkedList<String> list = new LinkedList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		
		ListIterator<String> itr; 
		
		for (itr = list.listIterator(); itr.hasNext();){
			
			System.out.println(itr.next());
			
		}
		System.out.print("\n");
		for (; itr.hasPrevious();){
			String item = itr.previous();
			System.out.println(item);
			if(item.startsWith("a") || item.startsWith("e") || 
				item.startsWith("i") || item.startsWith("o")
			|| item.startsWith("u")){
				itr.remove();
			}
		}
		System.out.print("\n");
		for (; itr.hasNext();){
			String item = itr.next();
			System.out.println(item);
		}
	}

}
