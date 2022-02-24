// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null) {
            return null;
        }
        
        //get intersection node
        ListNode intersection = getIntersection(head);
        
        //if no cycle then intersection will be null
        if(intersection == null) 
            return null;
        
        ListNode p1 = head;
        
        //we advance both intersection node and pointer at head
        //when both are equal we reach the start of the cycle
        while(p1 != intersection) {
            p1 = p1.next;
            intersection = intersection.next;
        }
        
        return p1;
    }
    

    //detect cycle and return node 
    private ListNode getIntersection(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        //2 pointers fast and slow, when fast == slow, we have detected cycle
        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return slow;
            }
        }
        
        return null;
    }
}