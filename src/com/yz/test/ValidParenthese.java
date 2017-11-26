package com.yz.test;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class ValidParenthese {

	private static char l1 = '(';
	private static char l2 = '[';
	private static char l3 = '{';
	private static char r1 = ')';
	private static char r3 = '}';
	private static char r2 = ']';

	private static Map<Character, Integer> map = new HashMap<>();

	static {
		map.put(l1, 1);
		map.put(l2, 2);
		map.put(l3, 6);
		map.put(r1, 4);
		map.put(r2, 5);
		map.put(r3, 3);
	}

	public static boolean isValid(String s) {
		Deque<Character> stack = new LinkedList<>();
		int index = 0;
		Character top;
		while (index < s.length()) {
			Character c = s.charAt(index);
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.addFirst(c);
				break;
			case ')':

				if (stack.isEmpty()) {
					return false;
				}

				top = stack.getFirst();
				if (top == '(') {
					stack.removeFirst();
				} else if (top == '[' || top == '{') {
					return false;
				} else {
					stack.addFirst(c);
				}
				break;
			case ']':

				if (stack.isEmpty()) {
					return false;
				}

				top = stack.getFirst();
				if (top == '[') {
					stack.removeFirst();
				} else if (top == '(' || top == '{') {
					return false;
				} else {
					stack.addFirst(c);
				}
				break;
			case '}':

				if (stack.isEmpty()) {
					return false;
				}

				top = stack.getFirst();
				if (top == '{') {
					stack.removeFirst();
				} else if (top == '[' || top == '(') {
					return false;
				} else {
					stack.addFirst(c);
				}
				break;
			default:
				return false;
			}

			index++;
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("({})[]"));
	}
}
