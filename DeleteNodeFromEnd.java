/*
 * #19. Remove Nth Node From End of List
 * 
 * Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?


1st Approach: Two pass

Using dummy node to avoid edge cases error
1. One pass to find the length of a LL
2. Second pass to go till (L-N)th node and update its next pointer (delete Nth node from end of a LL)

2nd Approach: One pass

Using two pointers p1 and p2 in one pass
Using dummy node to avoid edge cases error (e.g: [1] input will fail at p1.next = p1.next.next)

 */


/*
 * Time Complexity in two pass: O (n + n) -> O (2N) -> O (N)  // One pass for finding length of LL
 * 															  // Another pass for going till (L-N)th node and updating its next pointer
 * 
 * Time Complexity in one pass: O (N) -> just one pass to delete the Nth node from end of a LL
 * 
 * Space Complexity: O (1) -> No extra space used
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.linkedlist1;

public class DeleteNodeFromEnd {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 /************* Two Pass Approach ****************/
	        // Base condition
	        /*if(head == null){
	            return null;
	        }*/
	        /*
	        * Two Pass Approach
	        */
	        // Find the length of a LL
	        // First pass
	        // We will use the dummy node to avoid any outofbounds/nullpointer exceptions
	        // e.g: [1] -> expected output = []. In this case we will get error at curr.next = curr.next.next since it will go out of bounds w/o using dummy node
	        ListNode dummy = new ListNode(-1);
	        dummy.next = head;
	        ListNode curr = head;
	        int length = 0;
	        
	        // Find the length of LL
	        while(curr != null){
	            length++;
	            curr = curr.next;
	        }
	        
	        // Second pass
	        // Traverse till (length-N)th node and update its next pointer(delete Nth node from end)
	        // Reset the current node to dummy node
	        curr = dummy;
	        // Traverse till (l-n)th node
	        length -= n; 
	        while(length > 0){
	            length--;
	            curr = curr.next;
	        }
	        // Update the next pointer of current node (delete the nth node from end)
	        curr.next = curr.next.next; 
	        
	        
	        
	        /************* One Pass Approach **************/
	        // 1. Base condition
	        if(head == null){
	            return null;
	        }
	        
	        // 2. Initialize the dummy node to avoid edge cases error
	        ListNode dummyNode = new ListNode(-1);
	        
	        // 3. Connect dummy node to head node
	        dummyNode.next = head;
	        
	        // 4. Initialize P1 and P2 pointers 
	        ListNode p1 = dummyNode;
	        ListNode p2 = dummyNode;
	        
	        // 5. Increment the P2 pointer by 'n'
	        while(n > 0){ // Check for p2 != null in case if 'n' is invalid
	            p2 = p2.next;
	            n -= 1;
	        }
	        
	        // 6. Increment P1 and P2 both pointers simultaneously until P2 is the last element in LL (P2.next != null)
	        while(p2.next != null){
	            p1 = p1.next;
	            p2 = p2.next;
	        }
	        
	        // 7. Update the next of P1 to P1.next.next
	        p1.next = p1.next.next;
	        
	        // 8. Return the dummy.next as head node
	        // If we return head then will get error as first node is dummy node
	        return dummyNode.next;
	        
	    }
	 
}
