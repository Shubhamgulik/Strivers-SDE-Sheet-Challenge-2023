/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head == null || head.next == null) return head;

        head.next = flattenLinkedList(head.next);

        head = merge(head,head.next);
        head.next = null;
        return head;
    }
    public static Node merge(Node p1, Node p2){
        Node newHead=new Node(0);
        Node temp = newHead;

        while(p1 != null && p2 != null){
            if(p1.data <= p2.data){
                temp.child = p1;
                p1.next = null;
                p1 = p1.child;
                temp = temp.child;
            }else{
                temp.child = p2;
                                p2.next = null;

                p2 = p2.child;
                temp = temp.child;
            }
        }

        if(p1 != null){
            temp.child = p1;
        }else{
            temp.child = p2;
        }

        return newHead.child;

    }
}