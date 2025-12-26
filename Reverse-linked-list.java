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
    ListNode reversed; //head ptr for reverse LL
    public ListNode reverseList(ListNode head) {

        helper(head,null);
        return reversed;

    }
    private void helper(ListNode curr, ListNode prev){
        //base
        if(curr==null){
            reversed = prev;
            return;
        }
        //logic
        ListNode fast = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fast;
        helper(curr, prev);
    }
}