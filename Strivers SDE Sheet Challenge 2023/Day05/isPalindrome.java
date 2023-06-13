class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverseList(slow.next);
        slow = slow.next;
        ListNode temp = head;

        while(slow != null){
            if(slow.val != temp.val) return false;
            slow = slow.next;
            temp = temp.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null  )
            return head;
        ListNode new_head = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return new_head;
        
    }
}