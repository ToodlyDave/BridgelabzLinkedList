package com.linkedList;

public class LinkedListServices {
	
	Node head = null;

	public void insertAtHead(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void displayLinkedList() {
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.print(" " + currentNode.data);
			currentNode = currentNode.next;
		}
	}
}
