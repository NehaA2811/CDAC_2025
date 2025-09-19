/*
12. Write a Java program to add, search, remove, and display elements using 
HashSet. 
Testcase:   
Input:  Add duplicates ignored 
ADD A 
ADD A 
ADD B 
DISPLAY 
Output: [A, B] 
Input: Search present vs absent 
ADD A 
ADD B 
SEARCH A 
SEARCH C 
Output: true 
False
*/

import java.util.*;
class Q12Hashset{
	public static void main (String args[]){
		HashSet<String> set = new HashSet<>();
		
		System.out.println("Testcase 1:");
		set.add("A");
		set.add("A");
		set.add("B");
		System.out.println("Set :" + set);
		
		System.out.println("Testcase 2:");
		set.clear();
		set.add("A");
		set.add("B");
		
		System.out.println(set.contains("A"));
		System.out.println(set.contains("C"));
	}
}

/*
OUTPUT :

C:\Users\nehaa\OneDrive\Desktop\C DAC\Algorithm and Data Structure Using Java\Day 1\Assignment 1>javac Q11Hashset.java

C:\Users\nehaa\OneDrive\Desktop\C DAC\Algorithm and Data Structure Using Java\Day 1\Assignment 1>java Q11Hashset
Testcase 1:
Set :[A, B]
Testcase 2:
true
false
*/