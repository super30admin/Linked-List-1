// remove nth node from end of list

// O(n) time complexity
// O(1) space complexity
//iterate fast pointer till it reaches n and  the start the slow pointer from the start, when fst pointer reaches the end the slow pointer is at the right place with n elemens from end of list

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

       ListNode dummy = new ListNode(-1);
       dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;

       while(count <= n ){
        fast = fast.next;
        count++;
        
       }


       while(fast != null ){
        slow = slow.next;
        fast = fast.next;
       }

       slow.next = slow.next.next;

       return dummy.next;


        
    }
}
