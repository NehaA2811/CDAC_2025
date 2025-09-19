/*
14. Write a Java program to add, update, remove, and display books using 
HashMap. 
 
TestCases:  
 
Input: Basic add & sorted display 
ADD 205 Refactoring 
ADD 101 Clean_Code 
ADD 150 Effective_Java 
DISPLAY 
 
Output: {101=Clean_Code, 150=Effective_Java, 205=Refactoring} 
 
Input: Update, remove, and verify 
ADD 1 Alpha 
ADD 2 Beta 
UPDATE 2 Beta_2nd_Ed 
REMOVE 1 
DISPLAY 
Output: true 
true 
{2=Beta_2nd_Ed}
*/

import java.util.*;
class Q14HashMap {
	
		private static HashMap<Integer, String> books = new HashMap<>();
		
		public static void addBook(int id, String name){
			books.put(id, name);
		}
		
		public static boolean updateBook(int id, String newName){
			if(books.containsKey(id)){
				books.put(id, newName);
				return true;
			}
			return false;
		}
		
		public static boolean removeBook(int id){
			if(books.containsKey(id)){
				books.remove(id);
				return true;
			}
			return false;
		}
		
		public static void displayBooks(){
			TreeMap<Integer, String> sorted = new TreeMap<>(books);
			System.out.println(sorted);
			}
			public static void main(String args[]){
				
				System.out.println("Testcase 1:");
				addBook(205, "Refactoring");
				addBook(101, "Clean_Code");
				addBook(150, "Effective_Java");
				displayBooks();
				
				books.clear();
				System.out.println();
				
				System.out.println("Testcase 2:");
				addBook(1, "Alpha");
				addBook(2, "Beta");
				System.out.println(updateBook(2, "Beta_2nd_Ed"));
				System.out.println(removeBook(1));
				displayBooks();
			}
		}
				
	


