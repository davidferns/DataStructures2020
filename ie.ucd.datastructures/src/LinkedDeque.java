public class LinkedDeque<E> implements Deque<E> {
	
	private DoublyLinkedList<E> list = new DoublyLinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedDeque<Integer> ld = new LinkedDeque<>();

		ld.addFirst(1);
		ld.addFirst(2);
		ld.addFirst(3);
		ld.addFirst(4);

		ld.addLast(1);
		ld.addLast(2);
		ld.addLast(3);
		ld.addLast(4);

		System.out.println(ld);

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
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub
		list.addFirst(e);
		
	}

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub
		list.addLast(e);
		
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return list.removeLast();
	}
	
	public String toString() {
		return list.toString();
	}

}
