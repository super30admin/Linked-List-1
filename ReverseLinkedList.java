//Time complexity:O(n)
//Space Complexity:O(1)
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
        ListNode current = head, prev = null;
        ListNode temp;
        
        while(current !=null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
     }
}