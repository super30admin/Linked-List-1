// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We saw array or stack uses space and so we take 3 pointers prev = null, cirr = head, and fast = curr.next; and we loop in while till fast != null
 * we update curr.next = prev; prev = curr; curr = fast; fast = fast.next; and in the last curr.next = prev; to update the last node point and
 * return curr.
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head; 
        ListNode fast = curr.next;
        while(fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Same can also be done using recurrssion where recurssive stack is used. 
 * for eg 1->2->3->4->5 list reversed will have 5 and stack top will have 4 and updating pointer and unwinding recurrsive call will reverse it
 * and return reversed at the end.
 */

class ReverseLinkedListRec {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
