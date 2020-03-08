//o(n) time and constamt space
//passed all leetcode cases
//used multiple pointer reference approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //edge
        if(head==null || head.next ==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}