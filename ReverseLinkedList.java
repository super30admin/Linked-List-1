// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
