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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
