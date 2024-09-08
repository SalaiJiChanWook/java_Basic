                    
package homework;



public class CreatingStack {

    String stack[];
    int size, top;

    public CreatingStack(int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
    }

    public void offer(String data) {
        top++;
        stack[top] = data;
    }

    public void poll() {
       size--;
    }

    public void peek() {
        System.out.println("The top element is: " + stack[stack.length-(top+1)]);
    }

    public void isfull() {
        if (top == size - 1) {
            System.out.println("The stack is full.");
        } else {
            System.out.println("The stack is not full.");
        }
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty");
        }
    }

    public static void main(String[] args) {
        CreatingStack stack = new CreatingStack(5);
        stack.isEmpty();
        stack.isfull();

        stack.offer("A");
        stack.offer("B");
        stack.offer("C");
        stack.offer("D");
        stack.offer("E");

        
        stack.peek();

        stack.isEmpty();
        stack.isfull();
        stack.poll();
        stack.peek();
        stack.isEmpty();
    }

}
