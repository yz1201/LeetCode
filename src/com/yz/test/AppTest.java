package com.yz.test;

import org.junit.Test;

import com.yz.tool.MyLinkList;
import com.yz.tool.Node;

public class AppTest {

	@Test
	public void test() {

		long start = System.currentTimeMillis();

		// AddTwoNumbers.getNodeList();
		MyLinkList list = new MyLinkList();
		MyLinkList list2 = new MyLinkList();
		Node head = new Node(4);
		Node head2 = new Node(6);

		list.addFirstNode(head);
		list2.addFirstNode(head2);

		list.add(1, 5);
		list2.add(1, 7);

		list.add(2, 6);
		list2.add(2, 3);

		System.out.println("---------------list my list----------------");
		System.out.println("**************************");
	

		System.out.println("**************************");

		// AddTwoNumbers.getNodeList(list, list2);

		System.out.println("longest length: "+LongestSubstring.getNoRepeatingSubstring("aaaabcde"));
		
		long end = System.currentTimeMillis();
		// System.out.println(end);

		System.out.println("resume time: " + (end - start));
	}

	/*
	 * public static long resumeTime(){
	 * 
	 * }
	 */
}
