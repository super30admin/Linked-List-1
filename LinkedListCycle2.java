
//Idea: iterate through linkedlist till we detect the cycle. To detect cycle we are using two pointers  slow and fast. slow pointer moves by 1 position and fast 2 positions.
//so when both meet at one point then cycle detected.  to find out starting position of cycle take third pointer from starting and compare it with slow pointer.
//increase third and slow pointer till then both meet at one point. On ce the meet ,that point is starting point of cycle.

//distance from start of index till index where cycle begin == distance from fast and slow meet till begin index of cycle
//Time complexity : O(n)

//Space complexity : O(1)
public class LinkedListCycle2 {
	
	//ListNode class
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	//detect cycle begin index and check cycle by checking fast and slow equal
	 public static  int detectCycle(ListNode head) {
		 int i=1;
         ListNode slow = head;
         ListNode fast = head;
         while(fast!=null && fast.next!=null){
             fast = fast.next.next;
             slow = slow.next;
             i++;
             
             if(fast == slow){
            	 i=0;
                 ListNode slow2 = head;
                 while(slow2!= slow){
                     slow= slow.next;
                     i++;
                     slow2 =slow2.next;
                 }
                 
                 return i;
             }
             
         }
         return 0;
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
	          
	      
	      
	        /* Create a loop for testing */
	        head.next.next.next.next = head.next.next; 
	      
	       
	        int i = detectCycle(head); 
	        System.out.println(""); 
	        System.out.println(" tail connects to node index ="+i); 
	        
		}

}
