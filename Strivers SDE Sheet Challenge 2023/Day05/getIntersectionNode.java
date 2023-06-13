public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        Set<ListNode> set=new HashSet<>();

        ListNode node = h1;
        while(node != null){
            set.add(node);
            node = node.next;
        }
        
        node = h2;
        while(node != null){
            if(set.contains(node)) return node;
            node = node.next;
        }
        return null;
    }
}