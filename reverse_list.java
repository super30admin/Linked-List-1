// Time Complexity : O(N) all nodes in the list visited
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I knew the solution before.


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
        
    }
}

//Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        //whole list reverses except head
        ListNode R = reverseList(head.next);

        //manipulate head.next.next pointer to point to head
        head.next.next = head;

        //point head to null
        head.next = null;
        
        return R;
    }
}