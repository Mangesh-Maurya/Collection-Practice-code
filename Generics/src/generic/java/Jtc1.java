package generic.java;

import java.util.ArrayList;
import java.util.Iterator;
class Hello{
	void m1() {
		System.out.println("M1 in Hello");
	}
}
public class Jtc1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add(1234);
		al.add(new Hello());
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Object o=(Object)itr.next();
			if(o instanceof Integer) {
			//Integer in=(Integer)itr.next();	
				Integer i=(Integer)o;
			System.out.println(i);
			}
		}
		
	}

}
