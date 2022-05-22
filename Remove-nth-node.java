class Solution {
    // Time complexity is O(n)
    // Space complexity is O(1)
    // This solution is submiited on leetcode with no errors
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int counter = 0;
        while(counter <= n) {
            fast = fast.next;
            counter++;
        }
        // getting slow pointer one node before the deleting node
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //deleting the node
        slow.next = slow.next.next;
        // Return head.next because head can also get deleted
        return dummy.next;
    }
}