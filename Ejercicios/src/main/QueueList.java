package main;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;



public class QueueList {
	
	public QueueList() {
		
	}

	public static void main(String[] args) {
		
		/*Queue<Character> queue = new LinkedList();
		ArrayDeque<String> dQue = new ArrayDeque();
		
		dQue.add("IBM");
		dQue.add("jAVA");
		dQue.add("ACADEMY");
		
		
		//si usamos peek, solo se obtiene el elemento
		//si se usa el poll lo quita de la queue
		System.out.println(dQue);
		System.out.println(dQue.pollFirst());
		System.out.println(dQue.pollLast());
		
		System.out.println(dQue);*/
		
		
		System.out.println("ana: " + isPalindrome("ana"));
		System.out.println("vianey: " + isPalindrome("vianey"));
		System.out.println("madam: " + isPalindrome("madam"));
		System.out.println("civic: " + isPalindrome("civic"));

	}
	
	
	public static boolean isPalindrome(String cadena) {
		
			//PriorityQueue ordena los elementos de manera alfabetica		
			Queue<Character> queue = new LinkedList();
			ArrayDeque<Character> dQue = new ArrayDeque();
			
			for(int i =0; i < cadena.length(); i++) {
				queue.add(cadena.charAt(i));
				dQue.add(cadena.charAt(i));
			}
			
		
			while(!queue.isEmpty()) {
			
				Character c1 = queue.poll();
				Character c2 = dQue.pollLast();
			
				
				if(c1 != c2) {
					return false;
				}
				
				
			}
		
		return true;
	}
	
	
}
