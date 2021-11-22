package com.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		Node node1 = new Node(56);
		Node node2 = new Node(30);
		Node node3 = new Node(70);
		
		node1.next = node2;
		node2.next = node3;
	}
}
