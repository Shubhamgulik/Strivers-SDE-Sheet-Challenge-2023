import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.

    Queue<Integer> q;
    public Stack() {
        // Implement the Constructor.
        q = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        if(q.isEmpty()) return true;
        return false;
    }

    public void push(int x) {
        // Implement the push(element) function.
        q.add(x);
        for(int i=0; i<q.size()-1; i++){
            q.add(q.remove());
        }
        return;
    }

    public int pop() {
        // Implement the pop() function.
        if(q.isEmpty()) return -1;
        return q.remove();
    }

    public int top() {
        // Implement the top() function.
                if(q.isEmpty()) return -1;

        return q.peek();
    }
}