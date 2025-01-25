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
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = head;
            ListNode res = dummy;

        for (int i =0;i< n;i++){
            head = head.next;
        }
        if ( head == null){
            return dummy.next;
        } else {
        while (head.next != null){
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        }
        return res;
    }
}