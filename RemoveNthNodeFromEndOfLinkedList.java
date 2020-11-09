package S30.LinkedList_1;

/*
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

public class RemoveNthNodeFromEndOfLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        //creating gap of n+1 nodes between fast and slow pointers
        // n+1 because we need to be one node before the node to be deleted
        int temp = n+1;
        while(temp > 0){
            fast = fast.next;
            temp--;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }
}
