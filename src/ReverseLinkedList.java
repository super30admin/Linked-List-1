// Time Complexity:  O(n)
// Space complexity: O(n)

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
        if(head==null || head.next==null)
            return head;
        
        ListNode newHead = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return newHead;
      
//         // ******************** Iterative Method ********************
//         // Time Complexity:  O(n)
//         // Space complexity: O(1)
//
//         ListNode prev = null;
//         ListNode cur = head;
//         ListNode next;
//         while(cur!=null)
//         {
//             next = cur.next;
//             cur.next = prev;
//             prev = cur;
//             cur = next;
//         }
//         return prev;
      
    }
}
