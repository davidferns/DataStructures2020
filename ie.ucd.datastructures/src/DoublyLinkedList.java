import java.util.Iterator;

public class DoublyLinkedList<E> implements List<E> {

    //---------------- nested Node class ----------------
    /**
     * Node of a doubly linked list, which stores a reference to its
     * element and to both the previous and next node in the list.
     */
    private static class Node<E> {
        // TODO
    	private E element;
    	private Node<E> prev;
    	private Node<E> next;
    	
    	public Node(E e, Node<E> p, Node<E> n)
    	{
    		element =e;
    		prev = p ;
    		next = n;
    	}
    	
    	public E getElement()
    	{
    		return element;
    	}

    	public void setNext(Node<E> n)
    	{
    		next =n;
    	}
    	
    	public void setPrev(Node<E> p)
    	{
    		prev = p;
    	}
    	
    	public Node<E> getNext()
    	{
    		return next;
    	}
    	
    	public Node<E> getPrev()
    	{
    		return prev;
    	}
    	
    } //----------- end of nested Node class -----------

    // instance variables of the DoublyLinkedList
    /** Sentinel node at the beginning of the list */
    private Node<E> header;                    // header sentinel

    /** Sentinel node at the end of the list */
    private Node<E> trailer;                   // trailer sentinel

    /** Number of elements in the list (not including sentinels) */
    private int size = 0;                      // number of elements in the list

    /** Constructs a new empty list. */
    public DoublyLinkedList() {
        // TODO
    	header = new Node<>(null, null, null);
    	trailer = new Node<>(null, header, null);
    	header.setNext(trailer);
    }

    // public accessor methods
    /**
     * Returns the number of elements in the linked list.
     * @return number of elements in the linked list
     */
    public int size() { return size; }

    /**
     * Tests whether the linked list is empty.
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() { return size == 0; }

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

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    /**
     * Returns (but does not remove) the first element of the list.
     * @return element at the front of the list (or null if empty)
     */
    public E first() {
        // TODO
        return null;
    }

    /**
     * Returns (but does not remove) the last element of the list.
     * @return element at the end of the list (or null if empty)
     */
    public E last() {
        // TODO
        return null;
    }

    // public update methods
    /**
     * Adds an element to the front of the list.
     * @param e   the new element to add
     */
    public void addFirst(E e) {
        
    	addBetween(e, header, header.getNext());
       
    }

    /**
     * Adds an element to the end of the list.
     * @param e   the new element to add
     */
    public void addLast(E e) {
        
    	addBetween(e, trailer.getPrev(), trailer);
    }

    /**
     * Removes and returns the first element of the list.
     * @return the removed element (or null if empty)
     */
    public E removeFirst() {
        // TODO
    	if(isEmpty())
    	{
        return null;
    	}
    	return remove(header.getNext());
    }

    /**
     * Removes and returns the last element of the list.
     * @return the removed element (or null if empty)
     */
    public E removeLast() {
        // TODO
    	if(isEmpty())
    	{
        return null;
    	}
    	return remove(trailer.getPrev());
    }

    // private update methods
    /**
     * Adds an element to the linked list in between the given nodes.
     * The given predecessor and successor should be neighboring each
     * other prior to the call.
     *
     * @param predecessor   node just before the location where the new element is inserted
     * @param successor     node just after the location where the new element is inserted
     */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        // TODO
    	Node<E> newest = new Node<>(e , predecessor, successor);
    	predecessor.setNext(newest);
    	successor.setPrev(newest);
    	size++;
    }

    /**
     * Removes the given node from the list and returns its element.
     * @param node    the node to be removed (must not be a sentinel)
     */
    private E remove(Node<E> node) {
        // TODO
    	Node<E> predecessor = node.getPrev();
    	Node<E> successor = node.getNext();
    	predecessor.setNext(successor);
    	successor.setPrev(predecessor);
    	size--;
    	return node.getElement();
    }


    /**
     * Produces a string representation of the contents of the list.
     * This exists for debugging purposes only.
     */
    public String toString() {
        // TODO
    	Node<E> newNode = header.getNext();
		String s = "[";
		while(newNode.getElement() != null) {
			s=s.concat(newNode.getElement().toString());
			if (newNode.getNext().getElement() != null) {
				s=s.concat(", ");
			}
			newNode = newNode.getNext();
		}
		s=s.concat("]");
		return s;
    }

    public static void main(String [] args) {
        //ArrayList<String> all;
        //LinkedList<String> ll;
        DoublyLinkedList<String> ll = new DoublyLinkedList<String>();

        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        for (String s : alphabet) {
            ll.addFirst(s);
            ll.addLast(s);
        }
        System.out.println(ll.toString());

        
    }
} //----------- end of DoublyLinkedList class -----------
