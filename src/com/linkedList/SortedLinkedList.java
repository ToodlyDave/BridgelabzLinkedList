package com.linkedList;

public class SortedLinkedList {

	Node head = null;
	
	public void insertAtHead(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		displayLinkedList();
	}
	
	public void insert(int value) {
		Node newNode = new Node(value);
		
		if (head == null) {
			insertAtHead(value);
			return;
		}
		
		if (head.compareTo(newNode) > 0) {
			insertAtHead(value);
			return;
		}
		
		Node currentNode = head;
		Node prevNode = head;
		
		while (currentNode != null) {
			if(newNode.compareTo(currentNode) < 0) {
				newNode.next = currentNode;
				prevNode.next = newNode;
				break;
			}
			else if (newNode.compareTo(currentNode) > 0 && currentNode.next == null) {
				currentNode.next = newNode;
				break;
			}
			
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		
		displayLinkedList();
	}
	
	public void displayLinkedList() {
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.print(" " + currentNode.data);
			currentNode = currentNode.next;
		}
		
		System.out.println();
	}
}
