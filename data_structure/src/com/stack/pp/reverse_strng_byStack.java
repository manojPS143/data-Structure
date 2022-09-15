package com.stack.pp;

public class reverse_strng_byStack {
	 int top=-1;
	 int cap;
//	static int ele;
	 int[] stack;
	reverse_strng_byStack(String str){
		cap=str.length();
		stack = new int[cap];
	}

	public boolean isFull() {
	if(top==cap-1)
		return true;
	else
		return false;
	}
	public void push(int ele) {
		if(isFull())
			System.out.println("stack is full");
		else {
			top++;
			stack[top]=ele;
		}
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	public void pop() {
		if(isEmpty())
			System.out.println("stack is empty");
		else
			top--;
			System.out.println(stack[top]+"deleted");
	}
	public void peek() {
		if(isEmpty())
			System.out.println("stack is empty");
		else {
			top--;
			System.out.println(stack[top]);
			}
	}
		public String display() {
			String a1="";
			if(isEmpty())
				System.out.println("stack is empty");
			else 
				for(int i=top;i>=0;i--) {
					a1=a1+(char)stack[i];
			}
			return a1;
		}

	public static void main(String[] args) {
		String s="nanu ninu";
		String s1="ninu nanu";
		reverse_strng_byStack l1=new reverse_strng_byStack(s);
		reverse_strng_byStack l2=new reverse_strng_byStack(s1);
		
		for (int i = 0; i < l1.cap; i++) 
			l1.push(s.charAt(i));
		System.out.println(l1.display());
		
		//l1=new reverse_strng_byStack();
				
				for (int i = 0; i < l1.cap; i++) 
					l1.push(s.charAt(i));
				System.out.println(l1.display());

	}

}
