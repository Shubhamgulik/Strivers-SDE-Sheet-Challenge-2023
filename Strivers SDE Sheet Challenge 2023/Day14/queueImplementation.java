import java.util.* ;
import java.io.*; 
public class Queue {

    int[] q;
    
    int back;
    Queue() {
        // Implement the Constructor
        q = new int[5000];
        back = -1;
        // limit = 5000;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(back == -1) return true;
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        
            back++;
            q[back] = data;
        
    }

    int dequeue() {
        // Implement the dequeue() function
        if(back == -1) return -1;

        int x = q[0];
        for(int i=1; i<=back; i++){

           q[i-1] = q[i];

        }

       back--; 
        return x;
    }

    int front() {
        // Implement the front() function
        if(back == -1) return -1;
        return q[0];
    }

}
