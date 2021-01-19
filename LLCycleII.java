public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                ListNode n = checkPoint(head);
                return n;
            }
        }
        return null;
    }

    public ListNode checkPoint(ListNode head) {
        ListNode iter = head;
        Set<ListNode> set = new HashSet<ListNode>();

        while(iter != null) {
            if(set.contains(iter)){
                return iter;
            }
            set.add(iter);
            iter = iter.next;
        }
        return null;
    }
}