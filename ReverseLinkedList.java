// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//---Recursion----
// Traverse until the last node and keep assigning the last node's next to the previous node until we reach the first node
//---Iterative---
//We assign the first node's next to the node which is previous to the first node and keep movinf until we reach the last node

class ReverseLinkedList {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int ele) {
            data = ele;
        }
    }

    public ListNode reverseListRecur(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummy = reverseListRecur(head.next);

        head.next.next = head;
        head.next = null;
        return dummy;

    }

    public ListNode reverseListIter(ListNode head) {

        ListNode cur = head;
        ListNode prev = null;
        ListNode next = null;

        while (cur != null) {

            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;

    }

    public void printList(ListNode list) {

        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }

    }

    public static void main(String args[]) {
        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode list = new ListNode(5);
        list.next = new ListNode(4);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(9);
        list = obj.reverseListIter(list);
        System.out.println("Iterative approach");
        obj.printList(list);
        System.out.println(
                "Recursive approach reverses the list that has already been reversed by the iterative approach");
        list = obj.reverseListRecur(list);
        obj.printList(list);

    }

}