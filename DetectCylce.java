// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach


public class DetectCycle {

    public ListNode getMiddleNode(ListNode head){
        ListNode slow = head,fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head){
        if(head == null)
            return null;
        ListNode intersection = getMiddleNode(head);
        if(intersection == null){
            return null;
        }
        ListNode slow = head,fast = intersection;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;    
    }
}