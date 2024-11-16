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
 // Approach : Three pointer approach - Iterative solution
 // Time : O(n)
 // Space : O(1)
class Solution {
    public ListNode reverseList(ListNode head) {

        // edge case
        if(head ==null || head.next ==null) return head;
        
        ListNode prev = null; // pointer
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast!=null){
            curr.next = prev;
            prev =curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev; // need to make one more connection
        return curr;
    }
}

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
 // Approach : Recursive Approach
 // Time : O(n)
 // Space : O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case
        if(head == null || head.next == null) return head;
        // logic
        ListNode r =  reverseList(head.next);
        // head = stk.pop()
        head.next.next=head; // new head
        head.next = null;
        return r;
    }
}