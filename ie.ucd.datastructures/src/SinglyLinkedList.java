
import java.util.Iterator;

/**
 * A basic singly linked list implementation.
 */
public class SinglyLinkedList<E> implements Cloneable, Iterable<E>, List<E> {
    //---------------- nested Node class ----------------

    /**
     * Node of a singly linked list, which stores a reference to its
     * element and to the subsequent node in the list (or null if this
     * is the last node).
     */
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
    	
    	public void setNext(Node<E> n)
    	{
    		next =n;
    	}
    	
    	
    } //----------- end of nested Node class -----------

    // instance variables of the SinglyLinkedList
    private Node<E> head = null; // head node of the list (or null if empty)

    private int size = 0; // number of nodes in the list

    public SinglyLinkedList() {
    }              // constructs an initially empty list

    // access methods

    /**
     * Returns the number of elements in the linked list.
     *
     * @return number of elements in the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
      return null;
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
    	
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
		return null;
    }

    /**
     * Returns (but does not remove) the first element of the list
     *
     * @return element at the front of the list (or null if empty)
     */
    public E first() {
        // TODO
    	if(head == null)
    	{
    		return null;
    	}
    	return head.getElement();
        
    }

    /**
     * Returns the last node of the list
     *
     * @return last node of the list (or null if empty)
     */
    public Node<E> getLast() {
        // TODO
        return null;
    }

    /**
     * Returns (but does not remove) the last element of the list.
     *
     * @return element at the end of the list (or null if empty)
     */
    public E last() {
        // TODO
    	Node<E> last = head;
    	if(last == null)
    	{
    		return null;
    	}
    	else
    	{
    		while(last.getNext() != null)
    		{
    			last = last.getNext();
    		}
    		return last.getElement();
    		
    	}
        
    }

    // update methods

    /**
     * Adds an element to the front of the list.
     *
     * @param e the new element to add
     */
    public void addFirst(E e) {
        // TODO
    	head = new Node<E>(e, head);
    	size++;
    }

    /**
     * Adds an element to the end of the list.
     *
     * @param e the new element to add
     */
    public void addLast(E e) {
        // TODO
    	Node<E> newest = new Node<E>(e,null);
    	Node<E> last = head;
    	if(last == null)
    	{
    		head = newest;
    	}
    	else
    	{
    		while(last.getNext() != null)
    		{
    			last = last.getNext();
    		}
    		last.setNext(newest);
    	}
    	size++;
    }

    /**
     * Removes and returns the first element of the list.
     *
     * @return the removed element (or null if empty)
     */
    public E removeFirst() {
        // TODO
    	Node<E> newNode = head;
    	head = head.getNext();
		size--;
		return newNode.getElement();
    }

    @SuppressWarnings({"unchecked"})
    public boolean equals(Object o) {
        // TODO
        return false;   // if we reach this, everything matched successfully
    }

    @SuppressWarnings({"unchecked"})
    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        // TODO
        return null;
    }


    /**
     * Produces a string representation of the contents of the list.
     * This exists for debugging purposes only.
     */
    public String toString() {
        // TODO
    	Node current = head;
    	StringBuilder text = new StringBuilder();
    	if(current == null) {
    		System.out.println("List is empty");
    	}
    	while(current != null) {
    		text.append(current.element);
    		//System.out.println(current.element);
    		current = current.next;
    	}
    	
        return text.toString();
    }

    private class SinglyLinkedListIterator<E> implements Iterator<E> {
    	Node curr;
    	public SinglyLinkedListIterator()
    	{
    		curr = head;
    		
    	}
        @Override
        public boolean hasNext() {
        
            return curr!=null;
        }

        @Override
        public E next() {
        	E res =(E) curr.getElement();
        	curr = curr.getNext();
            return res;
        }
    }

    public Iterator<E> iterator() {
        return new SinglyLinkedListIterator<E>();
    }

    public static void main(String[] args) {
        //ArrayList<String> all;
        //LinkedList<String> ll;
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        
        sll.addFirst(0);
        sll.addFirst(1);
        sll.addFirst(3);
        sll.addFirst(4);
        sll.addFirst(5);
       
        System.out.println(sll);
        System.out.println(sll.toString());
        sll.addFirst(-100);
        sll.addFirst(+100);
        System.out.println(sll);
        System.out.println(sll.toString());
        System.out.println(sll.get(1));
        

        
        
    }
}

