// Time Complexity = O(N)
// Space Complexity = O(1)
// Approach
// 1. Make Head Element point Null
// 2. Reverse All Links Using the Pointers
// 3.Return LAST element as Head
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
        if(head == null || head.next == null){
            return head;     
        }
        ListNode prev= null;
        ListNode curr= head;
        ListNode fast= head.next;
        while(fast!=null){
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
            
        }
        return prev;
    }
}