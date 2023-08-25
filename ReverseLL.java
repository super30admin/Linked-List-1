// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Here we are using three pointers.

class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}