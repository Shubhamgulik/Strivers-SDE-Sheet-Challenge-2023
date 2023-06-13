/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head == null || head.next == null) return head;
        
        int count = 1;
        Node last = head;
        
        while(last.next != null){
            count += 1;
            last = last.next;
        }
        k = k%count;
        //if(count == k) return head;
        //if(k > count) k = k%count;
        if(k == 0) return head;
        
        Node temp=head;
        for(int i=1; i<count-k; i++){
            temp = temp.next;
        }
        Node dummy = temp.next;
        temp.next = null;
        last.next = head;
        
        return dummy;
    }
}