package com.stack.pp;

public class stack1 {
	 int top=-1,cap=6,ele;
	 int[] stack=new int[cap];

	public  boolean isFull() {
	if(top==cap-1)
		return true;
	else
		return false;
	}
	public  void push(int ele) {
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
	public  void pop() {
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
		public void display() {
			if(isEmpty())
				System.out.println("stack is empty");
			else 
				for(int i=top;i>=0;i--) {
					System.out.println(stack[i]);
			}
		}

	public static void main(String[] args) {
		stack1 s=new stack1();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(70);
		s.peek();
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
		s.display();
		
		stack1 s1=new stack1();
		for (int i = 0; i < s.top; i++) {
			s1.push(s.stack[i]);
		}
		s1.display();

	}

}
