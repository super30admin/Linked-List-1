// Time Complexity : O(n) where  n is no.of nodes in the LinkedList
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * We will be suing two pointers to solve the problem. One pointer say fast we will move n steps
 * ahead of 2nd pointer say slow. Then we iterate the linked list until fast reached the end.
 * This will bring slow the n+1 position from the end. We remove the node in front of the slow pointer
 * */

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //edge
        if(head==null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int i=0;
        while(i<n){
            i++;
            fast = fast.next;
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
