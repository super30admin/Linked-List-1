package com.ds.rani.linkedlist;

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

//Approach:take one extra node to keep track of every last visited node and only change the
// pointer of evrey current node to its previous node

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
//Iterative solution
// Time complexity:o(n) where n is linkedlist length
// Space Complexity:o(1)
    /**
     * Reverse linkedlist
     * @param head list head
     * @return head of linked list
     */
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode( 0 );
        ListNode curr = head;

        while (curr != null) {
            //save the reference for next node
            ListNode currNext = curr.next;
            //current node should point to previous node
            curr.next = temp.next;
            //temp.next always point to current node
            temp.next = curr;
            curr = currNext;
        }
        return temp.next;

    }

    //Recursive solution
    //Time complexity:o(n) where n is linkedlist length
    //Space Complexity:o(1)
    public ListNode reverseListRecursive(ListNode head) {
        return helper(head, null);
    }

    private ListNode helper(ListNode head, ListNode newHead) {
        //base case
        if (head == null)
            return newHead;

        ListNode next = head.next;
        head.next = newHead;
        return helper(next, head);
    }
}
