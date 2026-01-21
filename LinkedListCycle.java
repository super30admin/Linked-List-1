// Time Complexity : O(2N) = ~O(N), N nodes in the linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach :

// Let's keep 2 pointers fast and slow. Slow moves 1 node, fast moves twice that. If there is no cycle fast and slow pointer
// reaches null and the hasCycle flag is false. Else, since fast moves twice the speed of slow, we expect them to meet at a
// point and set hasCycle flag to true.

// To find the beginning of the cycle, we will reset the fast pointer to the start of the list. We increment the fast and
// slow by 1 node this time. Wherever they meet again is the start of the cycle. We have identified the distance required
// by the fast to reach the head of cycle is same as the distance slow needs to travel to reach the head of the cycle.

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        // Check if list has cycle
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            if (fast == null){
                return null;
            }
            fast = fast.next;
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }
        // Reset head and find the head of the cycle
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}


