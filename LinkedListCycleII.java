package com.ds.rani.linkedlist;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to.
 * If pos is -1, then there is no cycle in the linked list.
 * <p>
 * Note: Do not modify the linked list.
 * <p>
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1 Output: tail connects to node index 1 Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * <p>
 * Example 2:
 * Input: head = [1,2], pos = 0 Output: tail connects to node index 0 Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * <p>
 * Example 3:
 * Input: head = [1], pos = -1 Output: no cycle Explanation: There is no cycle in the linked list.
 * <p>
 * Follow up: Can you solve it without using extra space?
 */
//Approach: Based on floyeds algorihm
//Move slow by 1 space, fast by 2 spaces, when the meet at one point return  either slow or fast.
// eg. i am returning fast.now point slow  will point to head of linked list and fast will be at
// same point and traverse both by one position.when they meet each other that is start point of cycle.

//Time complexity:o(n):where n is linkedlist size
//Space complexity:o(1)
public class LinkedListCycleII {

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * Function to return the node  where cycle is strted in linked list
     *
     * @param head head of linkedlist
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode fast = cycleDetection( head );
        if (fast == null) return null;
        ListNode slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;


    }

    /**
     * Function to check whether linked has cycle or not
     *
     * @param head head of linkedlist
     * @return
     */
    private ListNode cycleDetection(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //no cycle in the linkedList
        if (fast == null || fast.next == null)
            return null;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return fast;
        }
        return null;//when linkedlist doesnt contain cycle
    }
}
