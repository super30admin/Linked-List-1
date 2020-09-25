/**
 * 
 */

/**
 * @author aupadhye
 *
 */

//Space and time complexity is O(n) for a linked list and O(1) for space

class reverse_ll { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  

    Node reverse(Node node) // Reverse the nodes in the linked list
    { 					
        Node prev = null;//	Set a reverse pointer and keep it null 
        Node current = node;// Set a current pointer and set it to head 
        Node next = null;  // Set a next pointer to null
        while (current != null) { 	// Iterate through each node and set next to next node and prev to previous node of current
            next = current.next; 
            current.next = prev; //Setting next to previous node
            prev = current; // Prev is set to the current node, so pointer is reversed
            current = next; //Go to next nodes
        } 
        node = prev; //Set head to last node.
        return node; 
    } 
  
   
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        reverse_ll list = new reverse_ll(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
} 
  
