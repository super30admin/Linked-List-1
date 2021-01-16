// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Recurse till the second-last element of the linked list, assign the last element as the head of the stack, and then reassign the pointer from the head to the second-last element in the list and go on further. 

public class ReverseLinkedListRecursive {

    //Solution 1: recursive method with return call
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode revList = reverseList(head.next);

        head.next.next = head;
        head.next = null;
         
        return revList;
    }

    //Solution 2: void recursive method
    // ListNode revList;
    // public ListNode reverseList(ListNode head) {
    //     if(head == null || head.next == null) return head;
    //     helper(head);
    //     return revList;
    // }
    
    // private void helper(ListNode head){
    //     if(head == null || head.next == null){
    //         revList = head;
    //         return;
    //     }
        
    //     helper(head.next);

    //     head.next.next = head;
    //     head.next = null;
    // }
}
