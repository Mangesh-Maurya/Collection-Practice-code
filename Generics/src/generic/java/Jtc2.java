package generic.java;

import java.util.ArrayList;
import java.util.HashMap;
class Student<T>{
	T sid;
	void showStudent() {
		System.out.println("show Student");
		System.out.println(sid);
	}
}
public class Jtc2 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1234);
		//al.add("abc");
		HashMap<Integer, String> hm=new HashMap<Integer, String>(); 
		//System.out.println(al);
		Student s1=new Student();
		s1.sid=101;//ab Integer type ka ho gya 
		s1.showStudent();
		s1.sid="Hellosid";//now String type ka ho gya
		s1.showStudent();
		System.out.println("***********\n");
		Student<String> s2=new Student<String>();
		//s2.sid=1010;
		s2.sid="Hi Sid";
		s2.showStudent();
	}
}
//T=type