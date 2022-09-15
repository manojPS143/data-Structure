package com.linkedList;

class Node{
  int data;
	Node add;
		Node(int data){
			 this.add=null;
		}	
	}
public class LL_Begin {
	static node root=null;
	public static void insrtBegin(int data) {
		node n=new node(data);
		if(root==null) {
			root=n;
			}else {
				n.add=root;
				root=n;
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
			System.out.println(temp.data+" ");
			temp=temp.add;
		}
		System.out.println();
		}
	}

public static void main(String[] args) {
insrtBegin(23);		
insrtBegin(56);
display();
	}

}
