package com.linkedList;

class node{
	public static node temp;
	node pre,next;
	int data;
	public node add;
	node(int data){
		pre=null;
		this.data=data;
		next=null;
	}
}
public class Doubly_LL {
	public static node root=null;
	public static void insert(int data) {
		node n= new node(data);
		if(root==null)
			root=n;
		else {
			node temp=root;
			while (temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
			n.pre=temp;
		}
	}
 public static void delete() {
	 if(root==null)
		 System.out.println("its empty");
	 else if(root.next==null)
		 root=null;
	 else {
		 node.temp=root;
		 
		while (node.temp.next.next!=null) {
			 node.temp=node.temp.next;
		}
		 node.temp.next.pre=null;
		 node.temp.next=null;
	 }
 }
 public static void display() {
		if(root==null)
			System.out.println("Its empty");
		else {
			node temp=root;
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		}
	}
	public static void size() {
		if(root==null) {
			System.out.println("L.L is empty");
		}
		else {
			int count=0;
			node temp=root;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}
			System.out.println();
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		insert(25);
		insert(56);
		insert(89);
		display();
		delete();
		delete();
		display();
	}

}
