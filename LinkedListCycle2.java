/*
Author: Akhilesh Borgaonkar
Problem: LC 142. Linked List Cycle II (Linked List-1)
Approach: Using Flyod's method here to detect a cycle and return the point of cycle. To detect cycle, I run slow and fast pointers 1x and 2x resp. 
	till they meet each other. If they meet before the fast reaches end of list then a cycle is detected. To find point of cycle, I reset my slow
	ptr and run both the ptrs 1 node at a time. The node at which they both ptr meet again is the point of cycle.
Time Complexity: O(n) where n is number of all list nodes in the LinkedList.
Space complexity: O(1) constant.
LC verified.
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //if the list is empty or has only 1 node
        if(head == null || head.next == null)
            return null;
        // two pointers to detect cycle
        ListNode slow = head;	//runs 1 node at a time
        ListNode fast = head;	//runs 2 node at a time
        
        while(fast != null || fast.next != null){	//till fast ptr reaches end of list
            slow = slow.next;	//move 1x
            fast = fast.next.next;	//move 2x
            if(slow == fast)	//if they meet means cycle is detected in the list
                break;
        }
        slow = head;			//reset slow pointer to head node
        while(slow != fast){	//now determining the node of cycle
            slow = slow.next;	//move both ptrs 1x
            fast = fast.next;
        }
        return slow;			//if slow and fast ptr meet again then the meeting point is node of cycle, return it.
    }
}