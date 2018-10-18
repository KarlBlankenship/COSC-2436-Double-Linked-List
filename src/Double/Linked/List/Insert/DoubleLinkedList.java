/*
 * This program will demonstrate a Double Linked List and an insert method.
 */
package Double.Linked.List.Insert;

/**
 * The DoubleLinkedList calls will contain an inner class for double
 * linked nodes as well as necessary methods for demonstrating the 
 * insert method. 
 * @author Karl
 */
public class DoubleLinkedList 
{
    /**
     * Inner class Node will define the blueprint for double linked list
     * nodes.
     */
    private class Node
    {
        String value;   // Value to be stored within a node.
        Node next;      // Reference variable points to the next node.
        Node prev;      // Reference variable points to the previous node.
        
        /**
         * Constructor that accepts a String value.
         * @param val 
         */
        Node(String val)
        {
            this.value = val;
        }
    }
    
    // Create the head and tail pointers.
    Node head;      // The head of the list.
    Node tail;      // The tail of the list.
    
    private void push(String val)
    {
        // Create the new Node.
        Node n = new Node(val);
        
        // Check to see if there is no current list and add singe node.
        if (head == null)
        {
            head = n;
            tail = n;
        }
        // Else, add the new node to the head and reset head pointer.
        else
        {
            n.next = head;
            head = n;
        }
    }
    
    private void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create an instance of the DoubleLinkedList class.
        DoubleLinkedList dll = new DoubleLinkedList();
        
        dll.push("x");
        System.out.println("Push x");
        dll.display();
        System.out.println("Head: " + dll.head.value);
        System.out.println("Tail: " + dll.tail.value);
    }
    
}
