// Time Complexity : O(n) where n is length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class DetectCycle {
    public static void main(String[] args) {
        
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        boolean cycleDetected = false;
        
        //the loop will break when either we finish traversing of entire listNode (no cycle)
        // or if there is cycle, then slow will becode equal to fast at some point
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                cycleDetected = true;
                break;
            }
        }
        
        if(!cycleDetected){
            return null;
        }
        
        //reset slow to start of listNode
        slow = head;
        
        //distance between start and point where cycle forms is equal to distance between point where both slow and fast pointer met in the above while loop
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
