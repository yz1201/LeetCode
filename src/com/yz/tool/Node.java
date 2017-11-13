package com.yz.tool;

public class Node {
	protected Node next;
	protected int data;

	public Node(int data) {
		super();
		this.data =data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void display() {
		System.out.print(data + " ");
	}
}
