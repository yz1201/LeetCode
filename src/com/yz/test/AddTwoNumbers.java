package com.yz.test;

import com.yz.tool.MyLinkList;
import com.yz.tool.Node;

public class AddTwoNumbers {

	public static MyLinkList getNodeList(MyLinkList list, MyLinkList list2) {
		MyLinkList linkList = new MyLinkList();

		Node head = new Node((list.getHead().getData() + list2.getHead().getData()) % 10);

		linkList.addFirstNode(head);

		int len = list.length();

		for (int i = 1; i < len; i++) {
			int tmp1 = list.findByPos(i).getData();
			int tmp2 = list2.findByPos(i).getData();
			int data = 0;
			data = (tmp1 + tmp2) % 10;
			System.out.println("add data: " + data);
			linkList.add(i, data);
		}
		linkList.displayAllNodes();
		return linkList;
	}

}
