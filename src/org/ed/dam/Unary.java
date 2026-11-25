package org.ed.dam;

public class Unary {

	public static void main(String[] args) {
		int result = +1;
		System.out.println(result);
		
		result --; //result = result -1
		System.out.println(result);
		
		//result = result +5
		result += 5;
		
		System.out.println(++result);
		System.out.println(result++);
	}

}
