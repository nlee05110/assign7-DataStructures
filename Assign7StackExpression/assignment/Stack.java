package assignment;
import java.util.EmptyStackException;
public class Stack<T> implements StackInterface<T> {
    Node<T> head;
    int size;
    @Override
    public void push(T item) throws EmptyStackException {
        Node<T> newNode = new Node<>(item);
        newNode.next = this.head;
        this.head = newNode;
        size++;
    }
    @Override
    public T pop() throws EmptyStackException {
		Node<T> node = this.head;
		this.head=this.head.next;
        T value = node.value;
		return value;
    }
    
    public T peek() {
        if(this.head == null){
            return null;
        }
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
        return this.size;

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

    public void showPostfix() {

		Node<T> curNode = this.head;
		System.out.printf("=================\n");
			System.out.printf("Postfix: ");
		while(curNode!=null) {
			System.out.printf("%c", curNode.value);
			curNode = curNode.next;
		}
        System.out.println();
    }

} 
