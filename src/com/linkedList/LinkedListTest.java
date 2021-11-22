package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedListServices list = new LinkedListServices();
		
		list.insertAtHead(70);
		list.insertAtHead(30);
		list.insertAtHead(56);
		
		list.displayLinkedList();
	}
}
