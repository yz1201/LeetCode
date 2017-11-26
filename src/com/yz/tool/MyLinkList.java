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
	 * 对单链表基本操作实现
	 */

	// 增加头节点
	public void addFirstNode(Node node) {
		node.next = head;
		head = node;
	}

	// 删除头结点
	public Node deleteFirstNode() {
		Node temp = head;
		head = temp.next;
		return temp;
	}

	// 增加第index个节点
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
		System.out.println("current: " + current);
		previous.next = node;
		pos = 0;
	}

	// 显示所有节点信息
	public void displayAllNodes() {
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	// 删除指定节点

	public void delete(int index) {
		Node current = findByPos(index);
		Node previous = findByPos(index - 1);
		previous.next = current.next;
	}

	// 删除倒数第N个节点
	public void deleteNNode(int N) {
		delete(this.length() - N - 1);
	}

	// 查询指定下标的节点信息
	public Node findByPos(int index) {

		Node current = head;
		pos = 0;
		while (pos < index) {
			current = current.next;
			pos++;
		}

		return current;
	}

	// 根据data查询节点

	public Node findByData(int data) {
		Node current = head;
		while (current.data != data) {
			current = current.next;
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

	public static void main(String[] args) {
		Node node = new Node(0);

		MyLinkList list = new MyLinkList();
		list.addFirstNode(node);
		
		list.add(1, 1);
		list.add(2, 2);
//		list.add(3, 3);
//		list.add(4, 4);
	}
}
