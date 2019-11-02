/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/* 206. Reverse Linked List, using three pointers, Iteration
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}

/* 206. Reverse Linked List, Recursion
Time Complexity: O(n)
Space Complexity: O(n) for the recursion stack
*/

class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode cur = head;
        ListNode temp = cur.next;

        temp = reverseList(temp);
        cur.next.next = cur;
        cur.next = null;
        return temp;
    }
}