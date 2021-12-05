package com.linkedList;

public class LinkedList {
	
	Node head = null;

	public void insertAtHead(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void append(int value) {
		Node currentNode = head;
		Node newNode = new Node(value);
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}		
		
		currentNode.next = newNode;
	}
	
	public void insertBetween(int before, int value) {
		Node currentNode = findNode(before);
		
		if(currentNode == null) {
			System.out.println(" This node does not exist! ");
			return;
		}
		
		Node newNode = new Node(value); 
		
		newNode.next = currentNode.next;
		currentNode.next = newNode;
		
	}
	
	public void deleteFront() {
		head = head.next;
	}
	
	public void deleteLast() {
		Node currentNode = head;
		Node prevNode = head;
		
		while(currentNode.next != null) {
			prevNode = currentNode;
			currentNode = currentNode.next;			
		}
		
		prevNode.next = null;
	}
	
	public Node findNode(int value) {
		Node currentNode = head;
		
		while(currentNode != null) {
			if(currentNode.data == value) {
				return currentNode;
			}
			
			currentNode = currentNode.next;
		}
		
		System.out.println(" Could NOT find " + value);
		return null;
		
	}
	
	public void deleteNode(int value) {
		Node currentNode = head;
		Node prevNode = head;
		
		while(currentNode != null) {
			if(currentNode.data == value) {
				prevNode.next = currentNode.next;
				return;
			}
			
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		
		System.out.println(" Could NOT find " + value);
		
	}
	
	public int size() {
		Node currentNode = head;
		int count = 0;
		
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		
		return count;
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
