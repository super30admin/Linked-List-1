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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next; //Stores curr.next to temp
            curr.next = prev; //Stores prev to curr.next
            prev = curr;
            curr = temp;
        }
        return prev; //Returns prev as it's the head of the new reversed list
    }
}