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
    
    /**
     * The insert method can be used to add a node to any place in the 
     * list. It will create a list with a given node if there are no
     * existing nodes. It can add a new node before a specified node and it
     * can add a new node after a specified node by using the boolean 
     * switch.
     * @param val The value to be contained in the new node.
     * @param position The position to reference in the list.
     * @param before if true, new node is created in front of the 
     * position reference. if false the new node is created after 
     * the position reference.
     */
    private void insert(String val, String position, Boolean before)
    {
        // Create a temporary pointer for cycling through list.
        Node pointer = head;
        
        // Create the new node.
        Node n = new Node(val);
        
        // Check to see if list is empty and if so add node pointers.
        if (head == null)
        {
            head = n;
            tail = n;
        }
        // Else, there is at least one node so search though list for post.
        else
        {
            // Advance pointer through the list.
            while (pointer != null)
            {
                // If the pointer finds the specified position.
                if (pointer.value.equals(position))
                {
                    if (before) // Will add the new node before the pointer.
                    {
                        if (pointer == head)
                        {
                            n.next = pointer;
                            pointer.prev = n;
                            head = n; 
                        }
                        else
                        {
                            pointer.prev.next = n;
                            n.prev = pointer.prev;
                            pointer.prev = n;
                            n.next = pointer;    
                        }
                    }
                    else  // Will add the new node after the pointer.
                    {
                        if (pointer == tail)
                        {
                            pointer.next = n;
                            n.prev = tail;
                            tail = n;
                        }
                        else
                        {
                            pointer.next.prev = n;
                            n.next = pointer.next;
                            pointer.next = n;
                            n.prev = pointer;
                        }
                    }
                }
                pointer = pointer.next;
            }
        }
    }
    
    /**
     * The display method will cycle through the list and will print
     * each element value to the terminal.
     */
    private void display()
    {
        // Create a temporary pointer.
        Node temp = head;
        // Cycle through the list and display the node values.
        while (temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    
    /**
     * The display Reverse method will cycle through the list in reverse
     * and will thus display the node values to the terminal in reverse.
     * I did this to check that all the prev pointers are created and
     * maintained.
     */
    private void displayReverse()
    {
        Node temp = tail;
        while (temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
    }
    
    /**
     * This is the main method that will create an instance of
     * DoubleLinkedList and will test the insert method.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create an instance of the DoubleLinkedList class.
        DoubleLinkedList dll = new DoubleLinkedList();
        
        // Verify that method will create an initial entry.
        dll.insert("f", "", true); 
        System.out.print("Insert f: ");
        dll.display();
        System.out.print(" Head should be f: " + dll.head.value);
        System.out.print(" Tail should be f: " + dll.tail.value + "\n");
        
        // Check that insert will insert an element at the beginning.
        dll.insert("d", "f", true);
        System.out.print("Insert d before f: ");
        dll.display();
        System.out.print(" Head should be d: " + dll.head.value);
        System.out.print(" Tail should be f: " + dll.tail.value + "\n");
        
        // Check that insert will insert before in the middle.
        dll.insert("e", "f", true);
        System.out.print("Insert e before f: ");
        dll.display();
        System.out.print(" Head should be d: " + dll.head.value);
        System.out.print(" Tail should be f: " + dll.tail.value + "\n");
        
        // Check that insert will insert after tail.
        dll.insert("t", "f", false);
        System.out.print("Insert t after f: ");
        dll.display();
        System.out.print(" Head should be d: " + dll.head.value);
        System.out.print(" Tail should be t: " + dll.tail.value + "\n");
        
        // Check that insert will insert after head.
        dll.insert("x", "d", false);
        System.out.print("Insert x after d: ");
        dll.display();
        System.out.print(" Head should be d: " + dll.head.value);
        System.out.print(" Tail should be t: " + dll.tail.value + "\n");
        
        // Display in reverse to check prev nodes.
        System.out.print("Reverse order: ");
        dll.displayReverse();    
    }
}
