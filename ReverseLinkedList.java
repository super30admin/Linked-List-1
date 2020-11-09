package S30.LinkedList_1;

/*
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

public class ReverseLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //Recursive solution
    public ListNode reverseListRecursive(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //Iterative Solution
    public ListNode reverseListIterative(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;

        }
        return prev;

    }
}
