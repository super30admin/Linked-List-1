// Time Complexity O(n)
// Space complexity O(1)
// Runs on LeetCode: Yes
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null){
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        int count = 0;
        while (fast.next != null && count < n) {
            fast = fast.next;
            count++;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;

        return dummyNode.next;
    }
}