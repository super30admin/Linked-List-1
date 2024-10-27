// brute force - traverse first for the length
//traverse second for length - n then delete node TC- O(2n)

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

 // with TC - O(n)  take two pointers
 
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;
        int count = 0;

        ListNode dummy = new ListNode(-1);//we need dummy because if we need to remove head in that case.

        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count<=n){
            
             //if (fast == null) return null; // In case n is larger than the list length
             fast = fast.next;
            count++;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;

        slow.next = slow.next.next;

        temp = null;

        return dummy.next;
    }
}
