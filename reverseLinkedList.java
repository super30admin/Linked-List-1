// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//make use of three pointers for better understanding. can also be done with two

// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode fast = head.next;
        while(fast != null) {
            cur.next = prev;
            prev = cur;
            cur = fast;
            fast = fast.next;
        }
        
        cur.next = prev; // to link the last node to remaining list
        return cur;
    }
}