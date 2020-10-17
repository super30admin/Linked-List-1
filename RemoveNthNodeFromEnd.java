

//Idea: To remove nth node from linked list , iterate linked list till nth element(length -n). we will add one new dummy node at start to handle edge conditions.
//therefore dummy node would be 0th element so we need to iterate loop till nth. nth element will be node before deleted node.
//removing node which we need to delete by assigning previous node next element to element after deleted node. 
//it removes link between deleted node and it's previous node(nth node)
//Time complexity : O(L)
//The algorithm makes two traversal of the list, first to calculate list length LL and second to find the (L - n)(L−n) th node. 
//There are 2L-n2L−n operations and time complexity is O(L).
//Space complexity : O(1)


public class RemoveNthNodeFromEnd {
	
	
	//ListNode class
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	
	//one pass sokution to remove nth node
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		//dummy node at start
	    ListNode dummy = new ListNode(0);
	    int length =0;
	    ListNode temp = head;
	    //assign dummy next to head
	    dummy.next = head;
	    //iterate linkedlist to calcualte length
	    while(temp!=null){
	        length++;
	        temp = temp.next;
	    }
	    
	    //nth index
	    length  = length - n;
	    temp = dummy; //assign dummy to temp
	    
	    
	    //iterate linkedlist again till  node beffore deleted node
	    while(length>0){
	        length--;
	        temp = temp.next;
	    }
	    
	    //removing node which we need to delete by assigning previous node next to element after deleted node.
	   temp.next = temp.next.next;
	    return dummy.next;
	    
	 }
	  // prints content of double linked list 
    static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    }
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(85); 
        head.next = new ListNode(15); 
        head.next.next = new ListNode(4); 
        head.next.next.next = new ListNode(20); 
          
        System.out.println("Given Linked list"); 
        printList(head); 
        head = removeNthFromEnd(head, 2); 
        System.out.println(""); 
        System.out.println(" linked list after deletion"); 
        printList(head); 
	}
}
