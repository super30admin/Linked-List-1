/*
 * #206. Reverse Linked List
 * 
 * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

 */


/*
 * Time Complexity: O (N) -> While loop to traverse the 'N' nodes of a Linked List
 * 
 * Space Complexity: O (1) -> No extra space used
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.linkedlist1;

// Definition for singly-linked list.
class ListNode {
	int val; // data
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next)
	{
		this.val = val; 
		this.next = next; 
	}
}

//Iterative Approach
public class ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
	        
	        // Base Condition
	        if(head == null){
	            return null;
	        }
	        
	        /*
	         * We need 2 pointers here, current and previous
	         * Initialize current to head and previous to null
	         */
	        ListNode curr = head;
	        ListNode prev = null;
	        
	        /*
	         * Traverse through the nodes of a Linked List until current node reaches null
	         * 	1. First, before updating current.next pointer, store the next node of current in temp node
	         * 	2. Then, update the current.next pointer to previous pointer (initially null)
	         *  3. Now, update previous pointer as current node (prev = curr)
	         *  4. And update the current node to next node (curr = nextNode -> curr.next)
	         *  5. Repeat the steps from 1 to 4  
	         * After current node reaches null, exit from while loop and return the previous node (which will be head of a reverse LL)
	         */
	        while(curr != null){
	            ListNode nextNode = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = nextNode;      
	        }
	        
	        return prev;
	    }

}
