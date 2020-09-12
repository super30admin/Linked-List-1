/*
 * #142. Linked List Cycle II
 * 
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Note: Do not modify the linked list.


Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.


Follow-up:
Can you solve it without using extra space?

 */


/*
 * Time Complexity with HashSet approach: O (N) -> To traverse through 'N' nodes of a LL
 * 
 * Time Complexity w/o HashSet approach: O (N) -> To traverse through 'N' nodes of a LL in both phases
 * 
 * Space Complexity with HashSet approach: O (N) ->  To keep track of visited nodes of a LL
 * 
 * Space Complexity w/o HashSet approach: O (1) -> No extra space required
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.linkedlist1;

import java.util.HashSet;

//Definition for singly-linked list.
class ListNode1 {
	int val; // data
	ListNode1 next;
	ListNode1() {}
	ListNode1(int val) { this.val = val; }
	ListNode1(int val, ListNode1 next)
	{
		this.val = val; 
		this.next = next; 
	}
}


public class LinkedListCycle {
	/*
	    * Using Floyd's algorithm
	    */
	    
	    // Phase 1 : Find the intersection point 
	    public ListNode1 getIntersect(ListNode1 head){
	        /*
	        * Phase 1: To find the intersection point (tail node)
	        * Two pointers: hare(fast pointer) and tortoise (slow pointer)
	        * Both pointers start with head node
	        * Hare pointer increments by 2
	        * Tortoise pointer increments by 1
	        * We increment pointers until hare can no longer advance
	        */
	        ListNode1 hare = head;
	        ListNode1 tortoise = head;
	        
	        while(hare != null && hare.next != null){
	            tortoise = tortoise.next;
	            hare = hare.next.next;
	            
	            // If two pointers meet
	            if(hare == tortoise){
	                return tortoise; // intersection point found, return it
	            }
	        }
	        return null; // no intersection point found
	         
	    }
	
	 public ListNode1 detectCycle(ListNode1 head) {
	       
	        // 1. Base condition
	        if(head == null){
	            return null;
	        }
	        
	        /*********** HashSet approach*********/
	        /*
	        * When we traverse the LL, we can keep track of visited nodes in a HashSet(HashTable)
	        * If there is no cycle in LL, all the nodes will be traversed only once
	        * If there is a cycle in LL, then a node to which tail node connects or a node
	        * at which cycle begins, will be visited twice.
	        * So, we can keep track of visisted nodes in a HashSet and check if a node already exists in the HashSet, that means we are visiting it second time and there is a cycle began at that node. So, return the node
	        */
	        
	        // 2. Create a HashSet to keep track of visited nodes
	        HashSet<ListNode1> visited = new HashSet<>();
	        
	        /*
	        * If node is not present in HashSet, add it
	        * And, make the next node as current
	        * Else, if it is already present, then return that node, indicating there is a cycle began at that node
	        * After exiting while loop, if no cycle found, return null
	        */
	        
	        // 3. Assign the head node as current node
	        ListNode1 curr = head;
	        
	        // 4. Traverse through the LL and check for visited nodes in HashSet
	        while(curr != null){
	            if(visited.contains(curr)){ // If 
	                return curr;
	            }
	            visited.add(curr);
	            curr = curr.next;
	        }
	        //return null; // If there is no cycle in LL
	        
	        
	      /********** Floyd's Algorithm approach ***********/
	     // Get the answer from phase 1
	        ListNode1 intersect = getIntersect(head);
	        
	        /*
	        * Phase 2: To find the entrance of a cycle in LL
	        * Two pointers: ptr1 and ptr2
	        * ptr1 starts at head
	        * ptr2 starts at intersection point(tail)
	        * Both pointers will increment by 1 until they becomes equal
	        */
	        
	        // Check if intersection point is null, if yes, no cycle can be found, return null
	        if(intersect == null){
	            return null;
	        }
	        
	        // If intersection point is not null, then find entrance of a cycle in LL
	        ListNode1 ptr1 = head;
	        ListNode1 ptr2 = intersect;
	        
	        // Find the entrance of a cycle
	        while(ptr1 != ptr2){
	            ptr1 = ptr1.next;
	            ptr2 = ptr2.next;
	        }
	        
	        return ptr1; // return the node where cycle began
	        
	    }
	    
}
