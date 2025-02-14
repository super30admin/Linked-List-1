// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/**
 * Approach: 
 * This problem is about removing the nth node from the end of a linked list.
 * First, I reversed the linked list so that the last node becomes the first node, making it easier to access the nth node from the end.
 * Then, I moved the pointer to the (n-1)th position in the reversed list and removed the current node by adjusting the previous node's next pointer.
 * Finally, I reversed the list again to restore its original order and returned the new head of the list.
 */ 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Reverse the linked list
        // This will make the last node become the first node
        ListNode reversedHead = reverseList(head);

        // Move the pointer cur by n-1 nodes to reach the node before the nth node
        ListNode prev = null;
        ListNode cur = reversedHead;

        // Move cur to the (n-1)th position in the reversed list
        for (int i=1;i<=n-1;i++) {
            prev = cur;
            cur = cur.next;
        }

        // If cur is still the first node in the reversed list, we need to remove it
        if (cur == reversedHead) {
            // It means that we have to delete the first node from end
            reversedHead = reversedHead.next; // Move the head to the next node
        } else {
            // Otherwise, move the current node by updating the previous node's next pointer
            prev.next = cur.next;
        }

        // Reverse the list again to resore the original order
        ListNode resultHead = reverseList(reversedHead);

        // Return the new head of the list after the removing
        return resultHead;

    }
    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode nextPtr = null;

        while (head != null) {
            nextPtr = head.next;
            head.next = prev;
            prev = head;
            head = nextPtr;
        }

        return prev;
    }
}


   

     