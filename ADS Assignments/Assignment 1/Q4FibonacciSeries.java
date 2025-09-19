/*
4. Fibonacci Series 
Problem: Write a Java program to print the first n numbers in the Fibonacci series. 
Test Cases: 
Input: n = 5 
Output: [0, 1, 1, 2, 3] 
Input: n = 8 
Output: [0, 1, 1, 2, 3, 5, 8, 13] 
*/

class Q4FibonacciSeries {
	static int fibonacci(int n){
		if(n <= 1)//base condition
		{
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String args[]){
		int num = 5;
		//for(int i=1; i<= num; i++){
			System.out.print(fibonacci (i)+ " ");
		}
		System.out.println();
		
		int num1 = 8;
		//for(int i=1; i<= num1; i++){
			System.out.print(fibonacci (i)+ " ");
		}
	}
}
