package collection.jtc.days;

import java.util.StringTokenizer;

public class Day7 {
	public static void main(String[] args) {
		StringTokenizer token=new StringTokenizer("Hi I am JTC student Learning java full Stack Course ","ja");
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		System.out.println(token.countTokens());
		
	}

}
