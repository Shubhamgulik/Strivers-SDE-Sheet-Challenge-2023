import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		// Write your code here.
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> temp;

        if(head1.data <= head2.data){
            
            
            head = head1;
            temp = head;
        }else{

           
            head = head2;
            temp = head2;
            head2 = head1;
            head1 = temp;
        }
         
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                head2 = head1;
                temp = temp.next;
                head1 = temp;
            }
        }
        if(head1 == null) temp.next = head2;
        return head;
        
	}
}
