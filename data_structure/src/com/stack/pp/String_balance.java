package com.stack.pp;

import java.util.Scanner;

public class String_balance {
	
		int top = -1, cap, stack[];

		String_balance(String d) {
			cap = d.length();
			stack = new int[cap];
		}
		public void push(int ele) {
			if (top==cap-1) 
				System.out.println("Stack is full");
			 else 
				top++;
			//	stack[top] = ele;
		}
		public void pop() {
			if (top>=-1) 
				System.out.println("Stack is empty");
			else
				top--;
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a string");
			String str = s.nextLine();
			String_balance st = new String_balance(str);
			if (str.isEmpty()) {
				System.out.println("String is Empty");
				System.exit(0);
			} else {
				for (int i = 0; i < st.cap; i++) {
					char r = str.charAt(i);
					if (r == '(') {
						st.push(r);
					} else if (r == ')') {
						st.pop();
					} else {
						System.out.println("Invalid string");
						System.exit(r);
					}
				}
			}
			System.out.println(st.top==-1 ? "String is balanced" : "String is unbalanced");
			s.close();

		}
}
