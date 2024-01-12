/*
* Approach:
*  1. Recursively call the reverse on next pointer until last node.

        if it is last node, 
            mark that as reversed head
* 
*  2. When we return to prev head for first time.
        head.next is the last node.

        point the next of last node to curr head.
            head.next.next = head

        // have impact for the first node.
            head.next = null
* 
*  3. This continues till the stack is empty. 
    finally return the reversed head.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(n)
    recursion call stack
* 
*/

public class ReverseLinkedListRecursion {
    // public ListNode reverseList(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     ListNode reversedNode = reverseList(head.next);

    //     head.next.next = head;

    //     head.next = null;

    //     return reversedNode;
    // }
    private ListNode reversedHead;

    private void reverse(ListNode head){
        if (head.next == null) {
            reversedHead = head;
            return;
        }
    
        reverseList(head.next);
    
        head.next.next = head;
    
        head.next = null;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;

        reverse(head);
        
        return reversedHead;
    }
}
