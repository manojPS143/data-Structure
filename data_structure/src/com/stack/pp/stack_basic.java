package com.stack.pp;

import java.util.Scanner;

public class stack_basic {
	static int top=-1;
	static int cap=5;
	static int ele;
	static int[] stack=new int[cap];

	public static boolean isFull() {
	if(top==cap-1)
		return true;
	else
		return false;
	}
	public static void push(int ele) {
		if(isFull())
			System.out.println("stack is full");
		else {
			top++;
			stack[top]=ele;
		}
	}
	public static boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	public static void pop() {
		if(isEmpty())
			System.out.println("stack is empty");
		else
			top--;
			System.out.println(stack[top]+"deleted");
	}
	public static void peek() {
		if(isEmpty())
			System.out.println("stack is empty");
		else {
			top--;
			System.out.println(stack[top]);
			}
	}
		public static void display() {
			if(isEmpty())
				System.out.println("stack is empty");
			else 
				for(int i=top;i>=0;i--) {
					System.out.println(stack[i]);
			}
		}
	public static void main(String[] args) {
//		push(10);
//		push(20);
//		push(30);
//		push(17);
//		push(07);
//		push(06);
//		pop();
//		peek();
//        display();
		Scanner s=new Scanner(System.in);
		while (true) {
			System.out.println("---------");
			System.out.println("1.push\n2.pop\n3.peek\n4.display\5.exit");
			System.out.println("__________");
			int m=s.nextInt();
			switch (m) {
			case 1: int a=s.nextInt();
							push(a);
			break;
			case 2: pop();
			break;
			case 3: peek();
			break;
			case 4: display();
			break;
			case 5: System.exit(m);
				break;
			default:System.out.println("invalid");
				break;
			}
		}
			
			}
			
		
	}


