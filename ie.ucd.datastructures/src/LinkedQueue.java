

public class LinkedQueue<E> implements Queue<E> {
	
	
	
	private static class Node<E> {
        // TODO
    	
    	private E element;
    	private Node<E> next;
    	
    	public Node(E e, Node<E> n)
    	{
    		element =e;
    		next =n;
    	}
    	
    	public E getElement()
    	{
    		return element;
    	}
    	
    	public Node<E> getNext()
    	{
    		return next;
    	}
    	
    	
    	
    }
	
	private Node <E> front, rear;
	private int size;
	
	public LinkedQueue() {
		front = null;
		rear =null;
		size =0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue<Integer> q = new LinkedQueue<>();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q);

		q.dequeue();
		System.out.println("After dequeue:" + q);

		q.enqueue(5);
		System.out.println("After enqueue(5): " + q);

		System.out.println("Size: " + q.size());

		System.out.println("Is empty: " + q.isEmpty());

		System.out.println("First: " + q.first());
		System.out.println(q);

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(e,null);
		if(rear == null)
		{
			front = newNode;
		}
		else {
			rear.next= newNode;
		}
		rear = newNode;
		size++;
		
		
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		if(front == null)
		{
			System.out.println("Queue is empty");
			return null;
		}
		return front.getElement();
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		E res = front.getElement();
		front = front.getNext();
		if(front == null)
		{
			rear = null;
		}
		size--;
		return res;
	}
	public String toString()
    {
        int i;
        String res = "";
        Node<E> current = front;

        while (current != null)
        {
           res = res + (current.getElement()).toString() + "\n";
           current = current.getNext();
        }

        return res;
    }

}
