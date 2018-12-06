package com.gmail.carbit3333333;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BlackList blackList = new BlackList();

		blackList.addBlackList(Double.class);
        blackList.addBlackList(Scanner.class);
		
		System.out.println("BalckList:");
		System.out.println(blackList);
		
		Stack stack = new Stack();
		stack.addStek(new Scanner(System.in),blackList);
        stack.addStek(2.2,blackList);
		stack.addStek("test1", blackList);
		stack.addStek(5, blackList);
		stack.addStek("test2", blackList);
		stack.addStek(boolean.class, blackList);
		stack.addStek("test3", blackList);
		stack.addStek(8, blackList);
		
		System.out.println("Stek:");
		System.out.println(stack);
		
		System.out.println("Delete value from stek:");
		stack.getRemoveStek("test2");
		System.out.println("Stek after delete value:");
		System.out.println(stack);
	}

}
