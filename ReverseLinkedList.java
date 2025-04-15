// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
This program provides both iterative and recursive solutions to reverse a singly linked list.
The iterative approach uses two pointers, prev and curr, to reverse the node links one by one until the entire list is reversed.
The recursive methods work by reaching the end of the list and then reversing the pointers during the unwinding phase.
One recursive version updates a class-level reference, while the other returns the new head directly.
All approaches have a time complexity of O(n) and space complexity of O(1) for the iterative method and O(n) for the recursive ones due to the call stack.

*/
class ReverseLinkedList {
    ListNode reversedHead=null;
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}