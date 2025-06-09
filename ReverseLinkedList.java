/**
 * Leetcode 206. Reverse Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list/description/
 *
 * All solutions are O(n) time complexity and O(1) auxiliary space complexity
 * for recursive solution it will have O(n) recursive stack space complexity
 */

// ------------------------------------- Solution 1 -----------------------------------
public class ReverseLinkedList {
    /**
     * Iterative solution
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}

// ------------------------------------- Solution 2 -----------------------------------
class ReverseLinkedList2 {
    /**
     * void based recursive solution which is completely same as above iterative solution
     * as list is reverse in the forward pass of the recursion like iteration, just the new head
     * is saved at global variable level once recursion reaches the base case
     */
    ListNode result;
    public ListNode reverseList(ListNode head) {
        helper(head, null);
        return result;
    }

    private void helper(ListNode curr, ListNode prev) {
        //base
        if (curr == null) {
            result = prev;
            return;
        }

        //logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        helper(curr, prev);
    }
}

// ------------------------------------- Solution 3 -----------------------------------
class ReverseLinkedLis3 {
    /**
     * same as above solution but a non-void based recursive call which doesn't need a global variable
     * to hold the new head as it is returned from the recursion base case to each successive call which
     * unfolds/pops from the recursive call stack
     */
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }

    private ListNode helper(ListNode curr, ListNode prev) {
        //base
        if (curr == null) {
            return prev;
        }

        //logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        return helper(curr, prev);
    }
}

// ------------------------------------- Solution 4 -----------------------------------
class ReverseLinkedList4 {
    /**
     * Pure recursive solution without any extra pointers. Idea is to return the reversedHead as the base
     * case and when that returns from recursive stack, you stand at second last node in the list from where
     * curr.next.next = curr takes care of reversing the pointer from current.next node to curr node
     *
     */
    public ListNode reverseList(ListNode head) {
        return helper(head);
    }

    private ListNode helper(ListNode curr) {
        //base
        if (curr == null || curr.next == null) {
            return curr;
        }

        //logic
        ListNode reversedHead = helper(curr.next);
        curr.next.next = curr;
        curr.next = null;

        return reversedHead;
    }
}

// ------------------------------------- Solution 5 -----------------------------------
class ReverseLinkedList5 {
    /**
     * Slightly different approach, at the end of the original list, mark the node as result and store in
     * global to return as reversedHead at the end. and as recursive stack unwinds/pops return the previous node
     * and from current recursive call attach current node to the returned prev.next. keep on doing this for all
     * the unwinding recursive calls popping from the stack
     */
    ListNode result;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return result;
    }

    private ListNode helper(ListNode curr) {
        //base
        if (curr == null || curr.next == null) {
            result = curr;
            return curr;
        }

        //logic
        ListNode reversed = helper(curr.next);
        reversed.next = curr;
        curr.next = null;

        return curr;
    }
}
