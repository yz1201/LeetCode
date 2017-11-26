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

	// ɾ��ͷ���
	public Node deleteFirstNode() {
		Node temp = head;
		head = temp.next;
		return temp;
	}

	// ���ӵ�index���ڵ�
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

	// ��ʾ���нڵ���Ϣ
	public void displayAllNodes() {
		Node current = head;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	// ɾ��ָ���ڵ�

	public void delete(int index) {
		Node current = findByPos(index);
		Node previous = findByPos(index - 1);
		previous.next = current.next;
	}

	// ɾ��������N���ڵ�
	public void deleteNNode(int N) {
		delete(this.length() - N - 1);
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

	// ����data��ѯ�ڵ�

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
