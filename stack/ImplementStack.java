// https://takeuforward.org/plus/dsa/problems/implement-stack-using-arrays
public class ImplementStack {
    int[] stack = new int[1000];
    int front = -1;

    public ImplementStack() {
    }

    public void push(int x) {
        stack[++front] = x;
    }

    public int pop() {
        int element = stack[front];
        front--;
        return element;
    }

    public int top() {
        return stack[front];
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }
}

// public class Main {
//     public static void main(String[] args) {
//         ImplementStack array = new ImplementStack();
//         array.push(5);
//         array.push(10);
//         System.out.println(array.top());
//         System.out.println(array.pop());
//         System.out.println(array.top());
//     }
// }
