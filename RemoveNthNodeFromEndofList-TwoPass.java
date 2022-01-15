//2 pass solution (https://leetcode.com/submissions/detail/619984558/)
//Time: O(n)
//Space: O(1)

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }       
        curr = head;
        if(count == 1) {
            return null;
        }
        count = count - n;
      
        int i = 1;
        while( i < count) {
            curr = curr.next;
            i++;
        }
        if(count == 0){
            head = curr.next;
            return head;
        }
        curr.next = curr.next.next;
        return head;
    }
}