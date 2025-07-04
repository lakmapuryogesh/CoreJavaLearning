package Basics;

import java.util.Random;

public class KeysStatic {
      static int number;
	public static void main(String[] args) {
		System.out.println(KeysStatic.number);
	number=new Random().nextInt();
	System.out.println(KeysStatic.number);
		
		number=new Random().nextInt();
		System.out.println(KeysStatic.number);
		number=new Random().nextInt();
		
		
		
	}
	public static void print() {
		System.out.println("Static method");
	}
    public void print1() {
    	System.out.println("Non-Static method");

    }
}
