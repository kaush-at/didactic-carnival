/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

   An input string is valid if:
	   Open brackets must be closed by the same type of brackets.
	   Open brackets must be closed in the correct order.
*/

package com.kaush.test;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		System.out.println("Input: s = () => Output : " +  validParantheses("()"));
		System.out.println("Input: s = ()[]{} => Output : " +  validParantheses("()[]{}"));
		System.out.println("Input: s = (] => Output : " +  validParantheses("(]"));
		System.out.println("Input: s = ([)] => Output : " +  validParantheses("([)]"));
		System.out.println("Input: s = {[]} => Output : " +  validParantheses("{[]}"));
		
	}
	
	public static boolean validParantheses(String str) {
		
		Stack<Character> charStack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char charactor = str.charAt(i);
			
			if(charactor == '{' || charactor == '(' || charactor == '[') {
				charStack.push(charactor);
			// Need to check stack is empty or not at first otherwise it will gives error when we get the peek
			// Exception: The method throws EmptyStackException if the stack is empty.
			}else if(!charStack.isEmpty() && charactor == '}' && charStack.peek() == '{' ) { 
				charStack.pop();
			}else if(!charStack.isEmpty() && charactor == ')' && charStack.peek() == '(' ) { 
				charStack.pop();
			}else if(!charStack.isEmpty() && charactor == ']' && charStack.peek() == '[' ) { 
				charStack.pop();
			}else {
				return false;
			}
		}
		
		return charStack.isEmpty();
		
	}

}
