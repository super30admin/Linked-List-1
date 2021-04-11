// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class Solution {
    private ListNode getIntersect(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode intersect = getIntersect(head);
        if(intersect == null) return null;
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while(ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
        
    }
}
