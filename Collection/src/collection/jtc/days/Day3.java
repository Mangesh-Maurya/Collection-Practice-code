package collection.jtc.days;
import java.util.*;
class Hello{	
}
public class Day3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add("aa");//auto boxing
		al.add(new Hello());
		al.add(11);
		System.out.println(al);//it is printing added order.
		
		//forEach loop
		for(Object o:al) {
			System.out.println(o);
		}
		System.out.println("****************");
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
	}
}
