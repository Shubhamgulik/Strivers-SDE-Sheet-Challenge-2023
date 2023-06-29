import java.util.* ;
import java.io.*; 

public class Stack {

    int top = -1;
    int[] stack;
    int limit;

    Stack(int n){
        stack=new int[n];
        limit = n;
    }


    void push(int num) {
        // Write your code here.
        if(top == limit) return;
        top++;
        stack[top] = num;
    return;
    }
    int pop() {
        // Write your code here.
                if(top == -1) return -1;

        int x = stack[top];
        top--;
        return x;
    }
    int top() {
        // Write your code here.
        if(top == -1) return -1;
        return stack[top];
    }
    int isEmpty() {
        // Write your code here.
        if(top == -1) return 1;

        return 0;
    }
    int isFull() {
        // Write your code here.
        if(top == stack.length) return 1;
        return 0;
    }
}
