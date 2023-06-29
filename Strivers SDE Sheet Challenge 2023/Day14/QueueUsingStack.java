import java.util.Stack;

public class Queue {
    // Define the data members(if any) here.

    Stack<Integer> input;
    Stack<Integer> output;
    Queue() {
        // Initialize your data structure here.
        input = new Stack<>();
        output = new Stack<>();
    }

    void enQueue(int x) {
        // Implement the enqueue() function.
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        input.push(x);
        while(!output.isEmpty()){
            input.push(output.pop());
        }
    }

    int deQueue() {
        // Implement the dequeue() function.
        if(input.isEmpty()) return -1;
        return input.pop();
    }

    int peek() {
        // Implement the peek() function here.
        if(input.isEmpty()) return -1;
        return input.peek();
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return input.isEmpty();
    }
}