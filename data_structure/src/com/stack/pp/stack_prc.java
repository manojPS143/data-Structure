package com.stack.pp;

import java.util.Scanner;

public class stack_prc {
	static int top=-1;
	static int cap=4;
	static int ele;
	static int stack[]=new int[cap];
	
	public static void push(int ele) {
		if (top==cap-1) {
			System.out.println("stack is full");
		} else {
			top++;
			stack[top]=ele;
		}
	}
	public static void pop() {
		if (top==-1) {
			System.out.println("stack is Empty");
		} else {
			top--;
			System.out.println(stack[top]+"deleted successfully");
		}
	}
	public static void peek() {
		if (top==-1) {
			System.out.println("stack is empty");
		} else {
			System.out.println(stack[top]+"its peek ele");
		}
	}
	public static void display() {
		if (top==-1) {
			System.out.println("its empty");
		} else {
			for (int i=top; i >=0; i--) {
				System.out.println(stack[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while (true) {
			System.out.println("_______________________________________________");
			System.out.println("1.push()\n2.pop()\n3.peek()\n4.display()\5.exit");
			System.out.println("-----------------------------------------------");
			int m=s.nextInt();
		switch (m) {
		case 1: int a=s.nextInt();
				push(a);
			break;
		case 2:pop();
			break;
		case 3:peek();
			break;
		case 4:display();
			break;
		case 5: System.exit(m);
		default:
			System.out.println("its not neccesary");
			break;
		}
		}
	}}
	

