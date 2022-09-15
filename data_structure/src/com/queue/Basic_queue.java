package com.queue;

import java.util.Scanner;

public class Basic_queue {
	static int front,rare,cap=3;
	static int queue[]=new int[cap]; 
	
	public static boolean isFull() {
		if(rare==cap)
			return true;
		else
			return false;
	}
	public static void enQueue(int ele)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else {
			queue[rare]=ele;
			rare++;
		}
	}
	public static boolean isEmpty() {
		if(rare==front)
			return true;
		else
			return false;
	}
	public static void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty");
		}
		else {
			for (int i = 0; i < rare-1; i++) {
				queue[i]=queue[i+1];
			}
			rare--;
		}
	}
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty");
		}
		else {
			for (int i = 0; i < rare; i++) {
				System.out.println(queue[i]);
			}
		}
	}
	public static void main(String[] args) {
//		enQueue(10);
//		enQueue(20);
//		enQueue(30);
//		enQueue(40);
//		enQueue(50);
//		display();
		Scanner s= new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.enQueue\n2.deQueue\n3.display\n4.isFull\n5.isEmpty\n6.exit");
			System.out.println("--------------------------------");
			int m=s.nextInt();
			switch (m) {
			case 1: int a=s.nextInt();
						enQueue(a);
				break;
			case 2: deQueue();
				break;
			case 3:display();
				break;
			case 4:if(rare==cap)
				System.out.println("its full");
			       else
			    System.out.println("space is left");
				break;
			case 5:if (rare==front) {
				System.out.println("its empty");
			}else {
				 System.out.println("element presen");
			}
//				if (rare==front) {
//				System.out.println("its empty");
//					else
//				System.out.println("no space");
//			}
				break;
			case 6:System.exit(m);
			default:System.out.println("invalid option");
				break;
			}
		}
	}

}
