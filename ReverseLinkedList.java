

 
public class ReverseLinkedList {
	
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	public static  ListNode reverseList(ListNode head) {
        if(head == null  || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
	   
//	public ListNode reverseList(ListNode head) {
//	       ListNode prev = null;
//	       ListNode curr = head;
//	       
//	       while(curr!=null){
//	           ListNode nextPointer = curr.next;
//	           curr.next = prev;
//	           prev = curr;
//	           curr = nextPointer;
//	       }
//	       
//	        return prev;
//	        
//	    }
	
	
	
	  
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
        head = reverseList(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        printList(head); 
	}

}
