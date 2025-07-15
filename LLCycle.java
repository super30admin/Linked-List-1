//Time Complexity:O(n) – traverse nodes at most twice (detect + find cycle start)
//Space Complexity: O(1) – uses only two pointers, no extra memory

//Use two pointers (`slow` and `fast`) to detect if a cycle exists by moving at different speeds.
//If they meet, reset one pointer to the head and move both one step at a time.
//The node where they meet again is the start of the cycle.



public class LLCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
        {
            return null;
        }
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle)
        {
            return null;
        }
        fast  = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
        
    }
}