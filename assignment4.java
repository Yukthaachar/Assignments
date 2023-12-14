
package assignment1;

public class assignment4 {
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
        assignment4 stack = new assignment4();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Size of the stack: " + stack.size());
    }
    
}

