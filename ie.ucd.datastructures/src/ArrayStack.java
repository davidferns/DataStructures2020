public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY =1000;
	private E[] data;
	private int top =-1;
	
	public ArrayStack() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		// TODO Auto-generated constructor stub
		data = (E[]) new Object[capacity];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> stack = new ArrayStack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (top+1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		if(size() == data.length)
		{
			System.out.println("Stack is full");
			return;
		}
		
		top++;
		data[top] = e;
		
		
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			return null;
		}
		
		return data[top];
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			return null;
		}
		E result = data[top];
		top--;
		return result;
	}
	
	public String toString()
	{
		String res ="";
		for(int i=top; i>=0; i--) {
			res+=data[i];
			res+=" ";
		}
		
		return res;
		
	}

}
