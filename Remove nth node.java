// Time complexity 0(n)
// space complexity 0(1)
// Code successfully executed in leetcode.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;
        int count =0;
        while(count <=n){
            fast =fast.next;
            count++;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;       
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}