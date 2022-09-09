/**
## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (206. Reverse Linked List)
Any problem you faced while coding this :       No
 */

// Input: head = [1,2,3,4,5]

 class ReverseList {
    public ListNode reverseList(ListNode head) {
        // base case
        if(head == null || head.next == null)
            return head;

        // create 3 pointers
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        // while end of listed list
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}