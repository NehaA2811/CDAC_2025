/*
13. Write a Java program to insert, delete, and display employee names in sorted 
order using TreeSet. 
TestCases:  
Input: Basic insert, sorted display, and delete 
INSERT Zara 
INSERT Aman 
INSERT Neha 
DISPLAY 
DELETE Neha 
DISPLAY 
Output: [Aman, Neha, Zara] 
true 
[Aman, Zara] 
 
 
Input: Duplicates ignored & case sensitivity 
            INSERT Meera 
INSERT meera 
INSERT Arjun 
INSERT Arjun 
DISPLAY 
DELETE Rahul 
DELETE Meera 
DISPLAY 
 
Output: [Arjun, Meera, meera] 
false 
true 
[Arjun, meera]
*/

import java.util.*;
class Q13TreeSet{
	public static void main (String args[]){
		TreeSet<String> employees = new TreeSet<>();
		
		System.out.println("Testcase 1:");
		employees.add("Zara");
		employees.add("Aman");
		employees.add("Neha");
		System.out.println("Employees :"+ employees);
		
		System.out.println(employees.remove("Neha"));
		System.out.println("Updated Employees:" + employees);
		System.out.println();
		
		System.out.println("Testcase 2: ");
		employees.clear();
		employees.add("meera");
		employees.add("Arjun");
		employees.add("Arjun");
		employees.add("Meera");
		System.out.println("New Employees List:" + employees);
		
		System.out.println(employees.remove("Rahul"));
		System.out.println(employees.remove("Meera"));
		System.out.println("Updated Employees:" + employees);
		
	}
}

/*
OUTPUT :

C:\Users\nehaa\OneDrive\Desktop\C DAC\Algorithm and Data Structure Using Java\Day 1\Assignment 1>javac Q13TreeSet.java

C:\Users\nehaa\OneDrive\Desktop\C DAC\Algorithm and Data Structure Using Java\Day 1\Assignment 1>java Q13TreeSet
Testcase 1:
Employees :[Aman, Neha, Zara]
true
Updated Employees:[Aman, Zara]

Testcase 2:
New Employees List:[Arjun, Meera, meera]
false
true
Updated Employees:[Arjun, meera]
*/