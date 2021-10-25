/**
 * Realization of a circular FIFO queue as an adaptation of a
 * CircularlyLinkedList. This provides one additional method not part of the
 * general Queue interface. A call to rotate() is a more efficient simulation of
 * the combination enqueue(dequeue()). All operations are performed in constant
 * time.
 */

public class LinkedCircularQueue<E> implements Queue<E> {
	
	private CircularlyLinkedList<E> list = new CircularlyLinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedCircularQueue<Integer> q = new LinkedCircularQueue<>();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q);

		q.dequeue();
		System.out.println("After dequeue:" + q);

		q.enqueue(5);
		System.out.println("After enqueue(5): " + q);

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
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		list.addLast(e);

	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return list.first();
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}
	
	public String toString()
	{
		return list.toString();
	}

}
