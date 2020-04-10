/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Two Pass Algorithm
// Time COmplexity: O(n)
// Space Complexity: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode prev = null, cur = head;
        int index = 0, size = 0;

        while(cur!=null){
            size++;
            cur = cur.next;
        }

        cur = head;

        while(cur != null) {
            if(index == (size - n)) {
                if(prev != null) {
                    prev.next = cur.next;
                    return head;
                }
                return head.next;
            }
            prev = cur;
            cur = cur.next;
            index++;
        }

        return head;
    }
}