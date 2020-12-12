/* Recursive Solution
Time Complexity : O(N)
Space Complexity : O(N)
Idea : Go to node just before the end, recursively reverse one link and return head in all returns.
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        // ListNode dummy = new ListNode();
        // dummy.next = head;
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
}

/* Iterative Solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 

 Time Complexity : O(N)
 Space Complexity  : O(1)
 Idea : Use 3 pointers and update temp first.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}