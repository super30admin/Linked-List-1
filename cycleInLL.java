// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Finding the edge cases, the null pointer exception when intersectNode was null. Fixed it. 
//                                              it runs fine now.

public class cycleInLL {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast;
        
        if(head == null) return null;
        
        ListNode intersectNode = findIntersection(head);
        fast = intersectNode;
        
        if(intersectNode == null) return null;
            
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;        
        
    }
    
    private ListNode findIntersection(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return fast;
            
        }
        return null;
    } 
}
