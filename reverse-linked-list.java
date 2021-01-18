// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// take current pointer and previous pointer. keep iterating for current and previous pointer and changing current's next to previous.

public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode prev = head;
    head = head.next;
    prev.next  = null;
    while(head.next != null){
        ListNode temp = head;
        head = head.next;
        temp.next = prev;
        prev = temp;
    }
    head.next = prev;
    return head; 
}