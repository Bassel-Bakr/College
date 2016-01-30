/*
 * @author Bassel Bakr
 */

public class SinglyLinkedList {
	public static void main (String[] args) {
		LinkedList myList = new LinkedList();
		
		for(int i = 9; i > 0; --i)
		    myList.append(i)
		          .prepend(i);
		          
		          
		int middle = (myList.getLength() / 2) - 1;
		
		myList.insertAfter(middle, 0);
		
		// try error handling by uncommenting next line
		// myList.insertAfter(-1, 0);
		          
		System.out.println("Length = " + myList.getLength());
		
		System.out.print("List items: ");
		
		for(Node head = myList.getNodeAt(0); head != null; head = head.getNext()) {
		    System.out.print(head);
		}
	}
	
	
	
	
	static class Node {
	    int value;
	    Node next;
	    
	    Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	    
	    Node(int value, Node next) {
	        this.value = value;
	        this.next = next;
	    }
	    
	    int getValue() {
	        return value;
	    }
	    
	    Node getNext() {
	        return next;
	    }
	    
	    void setValue(int value) {
	        this.value = value;
	    }
	    
	    void setNext(Node next) {
	        this.next = next;
	    }
	    
	    void swap(Node other) {
	        int value = other.value;
	        other.value = this.value;
	        this.value = value;
	    }
	    
	    @Override
	    public String toString() {
	        return String.valueOf(value);
	    }
	}
	
	static class LinkedList {
	    Node head;
	    Node tail;
	    int length;
	    
	    LinkedList() {
	        length = 0;
	        head = tail = null;
	    }
	    
	    int getHead() {
	        return head.getValue();
	    }
	    
	    int getTail() {
	        return tail.getValue();
	    }
	    
	    int getLength() {
	        return length;
	    }
	    
	    boolean isEmpty() {
	        return length == 0;
	    }
	    
	    LinkedList append(int value) {
	        if(length++ == 0)
	            tail = head = new Node(value, null);
	        else {
	            tail.setNext(new Node(value, null));
	            tail = tail.getNext();
	        }
	        return this;
	    }
	    
	    LinkedList prepend(int value) {
	        if(length++ == 0)
	            tail = head = new Node(value);
	        else
	            head = new Node(value, head);
	        return this;
	    }
	    
	    LinkedList insertAfter(int position, int value) {
	        checkBounds(position);
	        
	        ++length;
	        Node target = getNodeAt(position);
	        target.setNext(new Node(value, target.getNext()));
	        return this;
	    }
	    
	    LinkedList insertBefore(int position, int value) {
	        checkBounds(position);
	            
	        Node target = getNodeAt(position);
	        int position_value = target.getValue();
	        target.setValue(value);
	        insertAfter(position, position_value);
	        return this;
	    }
	    
	    Node getNodeAt(int position) {
	        checkBounds(position);
	            
	        Node target = head;
	        while(position --> 0)
	            target = target.getNext();
	            
	        return target;
	    }
	    
	    void checkBounds(int position) {
	        if(position < 0 || position >= length)
	            throw new IllegalArgumentException("Invalid position\n"
	                                              +"Position = "+position+"\n"
	                                              +"Length   = "+length);
	    }
	}
}
