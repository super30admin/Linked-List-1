//Time complexity: O(n)
//Space Complexity: O(1) | If we consider the recursive stack space it should be O(n)
//Program ran successfully
/*
    Algorithm: 1. To reverse a linked list, we need to modify the next pointers of each node
               2. This is a recursive solution where each time we modify the next pointer of the next element to point to itself
*/
class reverseListRecursive {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reversedHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedHead;
    }
}
