// public class ListNode {
//     int val;
//    ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//--------------------------------
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while (fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}
