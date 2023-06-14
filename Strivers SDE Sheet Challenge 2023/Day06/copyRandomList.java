// Method 1:

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();

        Node temp = head;

        while(temp != null){
            Node node=new Node(temp.val);
            map.put(temp,node);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            Node node = map.get(temp);

            node.next = map.get(temp.next); 
            node.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}


// Method 2: 

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        // Step 1: Add deep copies next to original nodes

        Node temp = head;

        while(temp != null){
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;

            temp = temp.next.next;
        }

        // Step 2: Add random pointers for deep copies as in the original nodes

        temp = head;

        while(temp != null){
            if(temp.random != null ) temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        // Step 3: Breaking link b/w Original and deep copy LL

        Node dummy=new Node(0);
        temp = dummy;
        Node fast;

        Node itr = head;

        while(itr != null){
            fast = itr.next.next;
            temp.next = itr.next;
            temp = temp.next;
            itr.next = fast;
            itr = fast;
        }

        return dummy.next;

    }
}