// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class reverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev, curr;
        prev = null;
        curr = head;
        
        while(curr!= null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;            
        }
        return prev;
    }
    
}
