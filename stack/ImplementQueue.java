// https://takeuforward.org/plus/dsa/problems/implement-queue-using-arrays
public class ImplementQueue {
    int size=5;
    int[] queue = new int[size];
    int start = -1, end = -1;

    public ImplementQueue() {
    }

    public void push(int x) {
        if(start==-1)
            start++;
        queue[(++end)%size] = x;
    }

    public int pop() {
        int element = queue[start%size];
        start=(start+1)%size;
        return element;
    }

    public int top() {
        return queue[start];
    }

    public boolean isEmpty() {
        if (start == -1) {
            return true;
        }
        return false;
    }
}


// public class Main {
//     public static void main(String[] args) {
//         ImplementQueue array = new ImplementQueue();
//         array.push(5);
//         array.push(10);
//         System.out.println(array.top());
//         System.out.println(array.pop());
//         System.out.println(array.top());
//         array.push(20);
//         array.push(30);
//         array.push(40);
//         array.push(50);
//         System.out.println(array.top());
//         for(int i=0;i<5;i++) {
//             System.out.print(array.top());
//             System.out.print(array.pop());
//         }
//     }
// }