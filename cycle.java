// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
public boolean hasCycle(ListNode head) {

    //The logic behind this approach is that if we move the fast pointer at a pace twice of that of
    // the slow pointer, if there exists a cycle, then the fast and the slow pointer
    //will point to the same node at one point of the loop.
    //When fast == slow, we start another slow_2 pointer until the slow and the slow2 pointer
    //meet each other.
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ListNode slow_2 = dummy;
                while(slow_2 != slow){
                    slow = slow.next;
                    slow_2 = slow_2.next;
                }
                return slow;
            }
        }
        return null;
    }