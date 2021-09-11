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
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// used a temp node so if in any case the entire list gets empty then that case is handled
// move the fast pointer till the count we get, then move the slow and fast pointer till we get null. once we get that then remove the node and send the header back.
// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        int count = 1;
        ListNode slow = temp;
        ListNode fast = temp;
        // move till the count
        while( count <= n ){
            fast = fast.next;
            count++;
        }
        // move along with the slow pointer
        while( fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}