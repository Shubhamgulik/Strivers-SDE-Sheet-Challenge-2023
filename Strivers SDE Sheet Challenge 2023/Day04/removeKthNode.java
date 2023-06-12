public class Solution
{
    public static Node removeKthNode(Node head, int k)
    {
        // Write your code here.
        if(head == null) return head;
        Node prev = null;
        Node temp = head;
        Node slow=head,fast=head;
        k=k-1;
        while(k > 0){
            fast = fast.next;
            k--;
        }
        while(fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev == null) return head.next;
        prev.next = slow.next;

        return head;

    }
}