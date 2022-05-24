/**Time complexity : O(N)
Space Complexity : O(N) RECURSIVE STACK
DID YOUR code run on leetcode : yes
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
//RECURSIVE SOLUTION

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode reversed = reverseList(head.next);
        //stack.pop();
        //head = stack.pop();
        
        head.next.next = head;
        head.next = null;
        
        return reversed;
    }
}
