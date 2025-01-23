//Time complexity: O(n)
//Space complexity: O(1)
//Leetcode: Yes

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
        if(head == null || (head.next == null && n==1)){
            return null;
        }

        ListNode ahead, behind, dummy;

        dummy = new ListNode(-1);
        dummy.next = head;

        ahead = dummy;
        behind = dummy;

        int i = 0;
        while(i<(n+1)){
            ahead = ahead.next;
            i++;
        }

        while(ahead != null){
            ahead = ahead.next;
            behind = behind.next;
        }

        behind.next = behind.next.next;

        return dummy.next;

        
    }
}