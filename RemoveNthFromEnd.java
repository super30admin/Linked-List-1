package com.ds.rani.linkedlist;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * <p>
 * Given n will always be valid.
 * <p>
 * Follow up:
 * <p>
 * Could you do this in one pass?
 */

//Approach:Use two pointers,slow and fast move fast to nth node.
// now move slow and fast both while fast is not reaching at end. for slow pointer just skip on node.

//Time Complexity:o(n) where n is linkedlist length
//Space Complexity:o(1)

public class RemoveNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * Remove nth node from end
     * @param head head of linkedlist
     * @param n integer
     * @return return head of linked list
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode( 0 );
        temp.next = head;

        // slow and fast are pointing to the heads previous node
        //Move fast pointer to nth node.
        ListNode slow = temp, fast = temp;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        //move slow and fast while fast is not reaching at end
        //when fast reaches at null my slow points to n-1 node
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //n-1 node will points to n+1 node so we are skipping nth node here
        slow.next = slow.next.next;

        //return head
        return temp.next;

    }
}
