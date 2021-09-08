// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode intersect = getIntersect(head);
        if(intersect == null)
            return null;
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while(ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare)
                return tortoise;
        }
        return null;
    }
}