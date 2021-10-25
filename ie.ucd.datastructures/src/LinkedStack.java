public class LinkedStack<E> implements Stack<E> {
	
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	
	public LinkedStack() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<Integer> stack = new LinkedStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		//Expected [1, 2, 3, 4]

		System.out.println("Pop: " + stack.pop());
		//Expected 4
		System.out.println(stack);
		//Expected [1, 2, 3]

		stack.push(5);
		System.out.println("Push(5)");

		System.out.println(stack);
		//Expected [1, 2, 3, 5]

		System.out.println("Top: " + stack.top());
		//Expected 5

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		list.addFirst(e);
		
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return list.first();
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}
	
	public String toString()
    {
        return list.toString();
    }

}
