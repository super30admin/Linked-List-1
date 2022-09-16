// TC - O(n)
// SC - O(1)

public class LinkedListCycle2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode detectCycle(ListNode head) {
            // null
            if (head==null) return null;

            boolean flag = false;
            ListNode slow = head;
            ListNode fast = head;

            while( fast != null && fast.next != null ) {
                slow = slow.next;
                fast = fast.next.next;
                if( slow==fast){
                    flag = true;
                    break;
                }
            }

            if(!flag) return null;
            slow = head;
            while( slow != fast ) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;

        }
    }
}
