
public class ArrayQueue<E> implements Queue<E> {
	
	private E[] data;
	private int front, rear, size;
	private final int MAX_SIZE;
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		front = 0;
		rear = 0;
		size = capacity;
		MAX_SIZE= capacity;
		data = (E[])new Object[capacity];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<Integer> aq = new ArrayQueue<>(10);

		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		System.out.println(aq);

		aq.dequeue();
		System.out.println("After a dequeue: " + aq);

		aq.enqueue(5);
		System.out.println("After enqueueing 5: " + aq);

		System.out.println("Size: " + aq.size());

		System.out.println("isEmpty: " + aq.isEmpty());

		System.out.println("First: " + aq.first());
		System.out.println(aq);

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == rear);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if(size == rear) {
			System.out.println("Queue is full");
			return;
		}
		else
		{
			rear = (front+size)%MAX_SIZE;
			data[rear] = e;
			rear++;
			size++;
		}
		
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		}
		
			
		return data[front];
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		else
		{
			E res = data[front];
			data[front]=null;
			front = (front +1)%MAX_SIZE;
			size--;
			return res;
		}
		
	}
	public String toString()
	    {
	        int i;
	        String res = "";
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return null;
	        }
	  
	        // traverse front to rear and print elements
	        for (i = front; i < rear; i++) {
	        	res+=data[i];
	        	res+=" ";
	        }
	        return res;
	    }

}
