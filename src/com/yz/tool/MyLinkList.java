package com.yz.tool;

public class MyLinkList {
	private Node head;
	private int pos = 0;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * �Ե������������ʵ��
	 */

	// ����ͷ�ڵ�
	public void addFirstNode(Node node) {
		node.next = head;
		head = node;
	}

	public Node deleteFirstNode() {
		Node temp = head;
		head = temp.next;
		return temp;
	}

	public void add(int index, int data) {
		Node node = new Node(data); // need to be added
		Node current = head;
		Node previous = head;
		while (pos != index) {
			previous = current;
			current = current.next;
			pos++;
		}
		node.next = current;
		previous.next = node;
		pos = 0;
	}

	// ��ʾ���нڵ���Ϣ
	public void displayAllNodes() {
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	// ��ѯָ���±�Ľڵ���Ϣ
	public Node findByPos(int index) {
		
		Node current = head;
		pos = 0;
		while (pos < index) {
			current = current.next;
			pos++;
		}

		return current;
	}

	public int length() {
		pos = 0;
		Node current = head;
		while (current != null) {
			current = current.next;
			pos++;
		}
		return pos;
	}
}
