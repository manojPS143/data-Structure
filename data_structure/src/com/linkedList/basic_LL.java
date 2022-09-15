package com.linkedList;

class node{
	int data;
	node add;
	node (int data){
		this.data=data;
		add=null;
	}
}
public class basic_LL {
	static node root=null;
	public static void insert(int data) {
		node n= new node(data);
				if(root==null) {
					root=n;
				}else {
					node temp=root;
					while(temp.add!=null) {
						temp=temp.add;
					}
					temp.add=n;
				}
	}
public static void insrtBegin(int data) {
		node n=new node(data);
		if(root==null) {
			root=n;
			}else {
				n.add=root;
				root=n;
		}
	}
public static void delete() {
	if(root==null) {
		System.out.println("Its empty");
	}else if(root.add==null) {
		root=null;
	}else {
		node temp=root;
	while(temp.add.add !=null) {
		temp=temp.add;
	}
	temp.add=null;
	}
}
public static void deleteBegin() {
	if(root==null) {
		System.out.println("L.L is empty");
	}
		else if(root.add==null){
			root=null;
		}
			else {
				node temp=root;
				root=temp.add;
				temp.add=null;
			}
	}
public static void display() {
	if(root==null)
		System.out.println("Its empty");
	else {
		node temp=root;
	while(temp !=null) {
		System.out.print(temp.data+" ");
		temp=temp.add;
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
			temp=temp.add;
		}
		System.out.println();
		System.out.println(count);
	}
}
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insrtBegin(17);
		size();
		display();
		delete();
		delete();
		display();
		deleteBegin();
		display();
		size();

	}

}

