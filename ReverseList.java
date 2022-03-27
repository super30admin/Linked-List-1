/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 time complexity = O(n)
 space Complexity = O(1)
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next ==null){
            return head;
        }
        ListNode left = head;
        ListNode cur = head.next;
        ListNode right = head.next.next;
        left.next = null;
        while(right!=null){
            cur.next = left;
            left = cur;
            cur = right;
            right = right.next; 
        }
        cur.next = left;
        return cur;
    }
}
