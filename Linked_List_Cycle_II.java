//Approach:
//1. Here first we will detect if there is a cycle by using two pointers, slow and fast where slow will move in 1x move and fast will move by 2x move. If there is a cycle, 
//slow and fast will come across each other at which point we will break out of the loop. When there is no cycle we will reach end of the list and return the result.
//2. Once cycle is found, we will keep the fast pointer at that position and reset slow to head, after which we will keep moving slow and fast at the same rate till they are equal.
//3. The point where both of them meet again is the starting point of the cycle, which we indicate by returning slow or fast.
public class Linked_List_Cycle_II {
	public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            return null;
        }
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
//Time Complexity : O(n) where n is the number of nodes
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :