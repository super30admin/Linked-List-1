// Time Complexity : O(n)
// Space Complexity : O(1)

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;
        ListNode slow = dummy;
        ListNode fast = dummy;
        //increment fast so that difference between slow and fast is n
        while(count <= n){
            fast = fast.next;
            count++;
        }
        //when fast reaches null, slow will point to n - 1
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //remove nth node
        slow.next = slow.next.next;
        return dummy.next;
    }
}