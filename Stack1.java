
package yy5;

public class Stack1 {
    public static final int MAX = 100;
    public int top=-1;
    public int[] arr = new int[MAX];
     
    public void push(int value) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            arr[top] = value;
        }
    }
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = arr[top];
            top--;
            return value;
        }
    }

    public int top() {
        if (isempty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    public boolean isempty() {
        return top < 0;
    }
    public int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println("Top element: " + stack1.top());
        System.out.println("Popped element: " + stack1.pop());
        System.out.println("Size of the stack: " + stack1.size());
    }
    
}

