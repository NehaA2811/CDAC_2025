/*
15. Write a Java program to add, update, remove, and display login details using 
LinkedHashMap. 
TestCases:  
Input:  Add, update, display (insertion order preserved) 
ADD alice a1 
ADD bob b1 
UPDATE alice a2 
DISPLAY 
Output: true 
{alice=a2, bob=b1} 
Input: Remove, re-add (reinserted at end) 
ADD alice a1 
ADD bob b1 
ADD carol c1 
REMOVE bob 
ADD bob b2 
DISPLAY 
Output: true 
{alice=a1, carol=c1, bob=b2}
*/

import java.util.*;
class Q15LinkedHashMap {
	
	private static LinkedHashMap <String, String> logins = new LinkedHashMap<>();
	public static void addLogin(String user, String pass){
			logins.put(user, pass);
		}
		
		public static boolean updateLogin(String user, String newPass){
			if(logins.containsKey(user)){
				logins.put(user, newPass);
				return true;
			}
			return false;
		}
		
		public static boolean removeLogin(String user){
			if(logins.containsKey(user)){
				logins.remove(user);
				return true;
			}
			return false;
		}
		
		public static void displayLogins(){
			System.out.println(logins);
		}
		
		public static void main(String args[]){
			System.out.println("Testcase 1:");
			addLogin("alice", "a1");
			addLogin("bob", "b1");
			System.out.println(updateLogin("alice", "a2"));
			displayLogins();
			
			logins.clear();
			
			System.out.println();
			System.out.println("Testcase 2:");
			addLogin("alice", "a1");
			addLogin("bob", "b1");
			addLogin("caro1", "c1");
			System.out.println(removeLogin("bob"));
			addLogin("bob", "b2");
			displayLogins();
		}
}
			