// Time Complexity : O(number fo nodes)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class RemoveNthNideFromEndOfLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        int temp = 0;
        // create 2 pointers and let 1 pointer stay 'n' nodes ahead. when fast pointer reaches, update slow pointer next element. And return head at the end.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(temp <= n){
            fast = fast.next;
            temp++;
        }
        // fast pointer is 'n' steps ahead, now start moving slow pointer

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode tempNode = slow.next;
        slow.next = slow.next.next;
        tempNode.next = null;
        return dummy.next;
    }
}