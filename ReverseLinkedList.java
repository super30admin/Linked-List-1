// Time Complexity : Iterative and Recursive - O(n) vecause we traverse through all elemnts in the linkedlist
// Space Complexity : Iterative O(1) | Recursive O(n) for stack space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

// Iterative Approach

// While traversing the list, change the current node's next pointer to point to
// its prev element. Since the node doesnt have reference to its prev node, we must store its prev
// element beforehand. We also need another pointer fast to store the next node before changing
// the reference. At the end, we will return the new head reference.

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null) {
            ListNode fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        return prev;
    }
}


// Recursive

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode r = reverseList(head.next);
        // now head will be equal to the popped element from stack
        head.next.next = head; // Reverse the tail of new reversed to list to point to current node
        head.next = null; // nullifies the fwd pointer as we need to reverse.
        return r;
    }
}