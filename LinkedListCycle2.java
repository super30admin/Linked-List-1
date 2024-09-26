// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Approach:
//1) Initialize slow and fast pointers at head;
//2) increment slow by one and fast by 2, when slow and fast are equal => there is cycle.
//3) reassign slow to head and move slow and fast by 1, and iterate till slow = fast, then return slow
public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
