/*
11. Write a Java program to add, update, remove, and display elements using 
LinkedList. 
Testcase:  
Input:  ADD A 
ADD B 
ADD C 
REMOVE 0 
DISPLAY 
Output: [B, C] 
Input:  ADD A 
ADD B 
ADD C 
UPDATE  1  X 
DISPLAY 
Output: [A, X, C]
*/

import java.util.*;
class Q11LinkedList {
	
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		
		System.out.println("Testcase 1:");
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("Add List:"+ list);
		
		list.remove(0);
		System.out.println("After remove 0:"+ list);
	
		 
		System.out.println("Testcase 2:");
		list.clear();
		list.add("A");
		list.add("B");
		list.add("C");
		list.set(1, "X");
		System.out.println("Updated List:"+ list);
	}
}
		
		 
		
		