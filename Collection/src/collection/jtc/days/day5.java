package collection.jtc.days;

import java.util.*;

public class day5 {
	public static void main(String[] args) {
		System.out.println("ArrayList*******\n");
		ArrayList al=new ArrayList();//differ type of element
		al.add("abc");
		al.add(1122);
		al.add("sdjhfu");
		al.add("abc");
		
		System.out.println(al);
		System.out.println("LinkedList*******\n");
		LinkedList l1=new LinkedList();
		l1.add("xyz");
		l1.add("aa");
		l1.add(123);
		l1.add("aa");
		l1.addFirst("first");
		l1.addLast("Last");
		System.out.println(l1);
		System.out.println("Vector*******\n");
		Vector v=new Vector();
		v.add("lmn");
		v.add(123);
		v.add("hello");
		v.add("lmn");
		v.addElement("testing");
		System.out.println(v);
		System.out.println("*****************\n");
		Iterator itr=al.iterator();
		
		Iterator itr1=l1.iterator();
		
		Iterator itr2=v.iterator();
		
	}
}
