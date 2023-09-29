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
//TC: O(N) SC: O(N)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head; 
        ListNode currHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return currHead;
    }
}

// if(head == null || head.next == null) return head; 
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode fast = curr.next;
//         while(fast != null) {
//             curr.next = prev;
//             prev = curr;
//             curr = fast;
//             fast = fast.next;
//         }
//         curr.next = prev;
//         return curr;