/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

            if(head == null||head.next == null) return head;

        int len = lengthOfLinkedList(head);

        if(len < k) return head;

        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        dummy.next = head;
        ListNode curr,nex;

        while(len >= k){
            curr = pre.next;
            nex = curr.next;

            for(int i=1; i<k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }

            pre = curr;
            len -= k;
        }

        return dummy.next;
    }

    static int lengthOfLinkedList(ListNode head) {
    int length = 0;
    while(head != null) {
        ++length;
        head = head.next;
    }
    return length;
}
}