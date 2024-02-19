// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        if( head == null  || head.next == null) return head;
        result = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return result;
    }
}