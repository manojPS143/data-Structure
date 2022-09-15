package com.stack.pp;

public class balanced_string {
	 int top=-1;
	 int cap;
//	static int ele;
	 int[] stack;
	balanced_string(String a){
		cap=a.length();
		stack = new int[cap];
	}

	public void push(int ele) {
		if(top==cap-1)
			System.out.println("stack is full");
		else {
			top++;
			//stack[top]=ele;
		}
	}
	public void pop() {
		if(top==-1)
			System.out.println("stack is empty");
		else
			top--;
	}
	public static void main(String[] args) {
		String str="(((()))())";
		 balanced_string b= new balanced_string(str);
			for (int i = 0; i < b.cap; i++)
				b.push(str.charAt(i));
			System.out.println(b);
	}

}
