package assignment;
import java.util.EmptyStackException;
public class Stack<T> implements StackInterface<T> {
    Node<T> head;
    @Override
    public void push(T item) throws EmptyStackException {
        Node<T> newNode = new Node<>(item);
        newNode.next = this.head;
        this.head = newNode;
    }
    @Override
    public T pop() throws EmptyStackException {
        this.head = this.head.next;
        T value = this.head.value;
        return value;
    }
    
    public T peek() {
		System.out.printf("=================\n");
		System.out.printf("---------------\n");
		System.out.printf("%s ----- Value ---- > ", this.head.toString());
        return this.head.value;
    }
    
    @Override
    public boolean isEmpty(){
        if(this.head == null){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int size(){
        return -1;

    }

	public void show() {
		Node<T> curNode = this.head;
		System.out.printf("=================\n");
		while(curNode!=null) {
			System.out.printf("---------------\n");
			System.out.printf("%s\n", curNode.toString());
			System.out.printf("Value: %d  Next: %h\n", curNode.value,curNode.next);
			curNode = curNode.next;
		}
	}

    
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();	
        stack.push(20);
        stack.push(10);
        stack.show();
        stack.pop();
        stack.show();
        System.out.println(stack.peek());
        System.out.print("Stack frame is empty(true) or not empty(false): " + stack.isEmpty());
    }
}
