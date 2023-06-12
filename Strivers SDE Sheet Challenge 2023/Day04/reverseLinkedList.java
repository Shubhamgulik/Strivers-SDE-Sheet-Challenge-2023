// Recursive Method : 
import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		// if(head == null) return null;
		return reverse(head);
    }
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> node){
		if(node == null || node.next == null) return node;

		LinkedListNode<Integer> newHead = reverse(node.next);

		node.next.next = node;
		node.next=null;
		
		return newHead;
	}
}



// Iterative Method : 

import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head == null) return null;
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> next = prev;

		while(curr != null){
			next = curr.next;
		
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
    }

}
