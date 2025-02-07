// Approach: Maintain three pointers: prev, curr, and nextNode. Initially, curr points to the head of the given linked list, while prev and
// nextNode are set to null. Iterate through the list using curr: Store the next node of curr in nextNode to preserve the remaining list.
// Reverse the link by pointing curr.next to prev. Move prev to curr and curr to nextNode. This process reverses one link at a time and
// progresses to the next node. Repeat until all links in the list are reversed, and curr becomes null, indicating the end of the list.
// Time Complexity: O(n) where n - node count
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/reverse-linked-list/description/

import java.util.Deque;
import java.util.ArrayDeque;

public class ReverseLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
        }
    }

    ListNode reverseUsingStack(ListNode head) {
        if (head == null) {
            return null;
        }
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        if (!stack.isEmpty()) {
            head = stack.pop();
        }
        temp = head;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    ListNode recursiveReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nextNode = head.next;
        ListNode reversed = recursiveReverse(nextNode);
        nextNode.next = head;
        head.next = null;
        return reversed;
    }

    ListNode iterativeReverse(ListNode head) {
        ListNode prev = null, curr = head, nextNode = null;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    void printLL(ListNode head) {
        if (head == null) {
            return;
        }
        while (head.next != null) {
            System.out.print(head.val + " -> " + "");
            head = head.next;
        }
        System.out.print(head.val + " -> NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL rll = new ReverseLL();
//        ListNode head = null;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.println("List before reversing..");
        rll.printLL(head);
        ListNode reversed = rll.iterativeReverse(head);
        System.out.println("List after reversing..");
        rll.printLL(reversed);
    }
}