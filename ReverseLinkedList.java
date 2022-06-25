/*
This approach uses recursion to reverse the linked list. It is a tail recursion, where we are changing the pointer to
next element at each node, to the node before it. This approach is not optimal, as the iterative approach does it in
O(1) space.

Did this code run on leetcode: Yes
*/
class Solution {
    //Time Complexity = O(n)
    //Space Complexity = O(n)
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
}