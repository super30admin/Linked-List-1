// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

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

//Recurssive appraoch
class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}