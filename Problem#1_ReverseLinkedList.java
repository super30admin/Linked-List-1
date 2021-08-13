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
        // ListNode root;
        ListNode curr;
        curr = head;
        //First node becomes the last node so will point to null.
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = nextNode;
        }
        return prev;
        
    }
}