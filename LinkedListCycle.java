// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
class LinkedListCycle{
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean found = false;

        // detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                found = true;
                break;
            }
        }

        //find head
        if(found){
            fast = head;
            while(fast != slow){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}