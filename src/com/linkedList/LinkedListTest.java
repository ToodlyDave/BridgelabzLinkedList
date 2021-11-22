package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedListServices list = new LinkedListServices();
		
		list.insertAtHead(56);
		list.append(30);
		list.append(70);
		list.insertBetween(30, 40);
		list.displayLinkedList();
		System.out.println(" SIZE: " + list.size());
		
		list.deleteNode(40);
		list.displayLinkedList();
		
		System.out.println(" SIZE: " + list.size());
	}
}
