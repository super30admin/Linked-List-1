// Time Complexity : O(N) N-> No of Nodes in Linkedlist
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public ListNode RemoveNthNodeFromList(ListNode head, int n) {
        if(head == null)
            return null;

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        while(n >= 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummyHead.next;

}