public class LinkedListCycle {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // 2(a + b) = a + b + k(c + b)
    // a = (k -1 )b + kc
    //
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null ) return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != slow) {
            if(fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;


    }
}