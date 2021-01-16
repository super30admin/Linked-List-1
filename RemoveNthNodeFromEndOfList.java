// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Intialize a slow pointer to the head and the fast pointer to the nth node of the list. Increment the slow pointer and the fast pointer, till fast doesnt reach to the end of linked list. Now slow pointer is at the node which we want to remove. Create a dummy i.e slower pointer, lagging by 1 wrt the slow pointer, which will be used to remove the slow pointed node from the linked list.

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode slower = dummy;
        slower.next = head;
        ListNode slow = head;
        ListNode fast = head;
        
        int count = 1;
        while(count < n){
            fast = fast.next;
            count = count + 1;
        } 

        while(fast.next != null){
            slower = slow;
            slow = slow.next;
            fast = fast.next;
        }

        slower.next = slow.next;
        
        if(slower == dummy) 
            head = slower.next;
        
        return head;
    }
}