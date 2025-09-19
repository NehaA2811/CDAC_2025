/*
Q.3Factorial 
Problem: Write a Java program to compute the factorial of a given number. 
Test Cases: 
Input: 5 
Output: 120 
Input: 0 
Output: 1 
*/

class Q3Factorial {
	static int fact (int n){
		if (n <= 0)
			return 1;
		else 
			return n*fact (n-1);
	}
	
	public static void main(String args[]){
		
		int n1 = 5;
		int a = fact(n1);
		System.out.println(a);
		//System.out.println("Factorial of " + n1 + " is: " +fact(5));
		
		int n2 = 0;
		System.out.println("Factorial of " + n2 + " is: " +fact(0));
	}
	
}

/*
OUTPUT :
C:\Users\nehaa\OneDrive\Desktop\C DAC\Algorithm and Data Structure Using Java\Day 1\Assignment 1>javac Q3Factorial.java

C:\Users\nehaa\OneDrive\Desktop\C DAC\Algorithm and Data Structure Using Java\Day 1\Assignment 1>java Q3Factorial
Factorial 5 is: 120
Factorial 0 is: 1
*/
