//Space complexity is O(1) and time complexity is O(n) Since we have to iterate all the nodes 

/**
 * 
 */

/**
 * @author aupadhye
 *
 */
public class Cycle_LinkedList {

	/**
	 * @param args
	 */
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
	  

	    public static Node cycle(Node head) {
	    	
	    	
	    	Node slow = head;
	    	Node fast = head;
	    	
	    	while(fast!=null && fast.next!=null) {// Take two pointers fast and slow
	    		fast = fast.next.next;// Fast iterates by two nodes
	    		slow = slow.next;// Slow iterates by one node
	    		if(fast == slow) {// At one point if fast and slow meet, that means that linked list has a cycle
	    			break;
	    		}
	    		
	    		
	  
	    		//If we add break in the code then the cycle will break;
	    	}
	    	
			slow = head;
    		while(fast!=slow) {
    			slow = slow.next;
    			fast = fast.next;
    			
    		}
	    	
	    	return slow;
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
	    	Cycle_LinkedList list = new Cycle_LinkedList();
	        list.head = new Node(85); 
	        list.head.next = new Node(15); 
	        list.head.next.next = new Node(4); 
	        list.head.next.next.next = new Node(20); 
	        
	        list.head.next.next.next.next = list.head; 
	        
	        System.out.println(cycle(head).data);
	    }
}
