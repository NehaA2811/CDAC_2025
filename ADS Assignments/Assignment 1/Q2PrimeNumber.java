/*
Q.2Prime Number 
Problem: Write a Java program to check if a given number is prime. 
Test Cases: 
Input: 29 
Output: true 
Input: 15 
Output: false 
*/

class Q2PrimeNumber {
	static boolean isPrime(int n, int i){
		if (n <= 1){
			return n;
			//return false;
		}
		
		if (n % i == 0)
			return false;
		else
			return true;
		}
		
		//if (i * i > n){
		//	return true;
	
		
		return isPrime(n, i + 1);
		}    
	
	public static void main(String args []){
		int num1 = 29;
		int num2 = 15;
		
		System.out.println(num1 + " is prime " + isPrime(num1, 2));
		System.out.println(num2 + " is prime " + isPrime(num2, 2));
	}
