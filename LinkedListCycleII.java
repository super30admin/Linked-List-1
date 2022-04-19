// Time Complexity : O(n) n is num of elements in linkedList
// Space Complexity : O(1) no aux data
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode first = head;
        ListNode intersect = helper(head);
        // checking if this has a cycle
        if(intersect == null)
            // no cycle
            return null;

        // find the first element where the cycle begins
        while(first != intersect){
            first = first.next;
            intersect = intersect.next;
        }
        return first;
    }
    public ListNode helper(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode a = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return slow;
        }
        return null;
    }
}
