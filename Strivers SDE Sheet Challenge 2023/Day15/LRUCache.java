class LRUCache {
    Node head = new Node(0,0), tail = new Node(0,0);
    int capacity;
    HashMap<Integer,Node> map=new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }    
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }

        if(map.size() == capacity){
            remove(tail.prev);
        }
        Node node = new Node(key,value);
        insert(node);
    }

    private void insert(Node node){
        map.put(node.key,node);

        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;

    }

    private void remove(Node node){
        if(map.containsKey(node.key)) map.remove(node.key);

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    class Node{
        Node next,prev;
        int key,value;

        Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
