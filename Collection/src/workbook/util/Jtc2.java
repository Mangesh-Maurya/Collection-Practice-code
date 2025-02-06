package workbook.util;

import java.util.*;


//Using List Interface
public class Jtc2 {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Integer(99));
		al.add("som");
		al.add("123");
		al.add("some@jtc");
		al.add("som");
		System.out.println(al);
		al.add(0,"aaaa");
		al.add(2,"bbbb");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("som"));
		System.out.println(al.lastIndexOf("som"));
		al.set(0, "jtc");
		System.out.println(al);
		List list=al.subList(1, 4);
		System.out.println(list);
		System.out.println("forword order");
		ListIterator li=al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("reverse order");
		while(li.hasPrevious()) {
			System.out.println(li.previous()+"previos");
			System.out.println(li.next()+"next");
		}
		}
}
