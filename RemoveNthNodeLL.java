/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 * Idea - > Handle deleting 1st node and also reaching the node before the one to be deleted using a dummy node.
 // U keep the relative difference between two pointers by n distance. 
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode node = dummy;
        while(n!=0){
            node = node.next;
            n--;
        }
        ListNode prevDel = dummy;
        while(node.next!=null){
            prevDel = prevDel.next;
            node = node.next;
        }
        ListNode toDel = prevDel.next;
        prevDel.next = toDel.next;
        toDel = null;
        return dummy.next;
    }
}