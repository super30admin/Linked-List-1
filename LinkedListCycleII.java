// Time Complexity : O(n)
// Space Complexity : O(1)
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;
        
        ListNode slow = head, fast = head;
        boolean hasCycle = false;
        
        // always check for node moving fast
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            // need to check if we found a intersection point
            if(slow == fast)
            {
                hasCycle = true;
                break;
            }
            
        }
        // according to question
        if(!hasCycle)
            return null;
        
        // reset because when slow == fast can be any point and not guarantee to be intersection point
        // To get exact point, use formula 2(a+b) = a+b+c+b ; a = c when moving at 1 step from starting
        slow = head; // move to a
        // fast pointer is at point of intersection
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}