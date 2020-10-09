// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

Q1)O(n) ,O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            //traverse
            ListNode head_next=head.next;
            //reverse pointers
            head.next=prev;
            prev=head;
            head=head_next;
        }
        return prev;
    }
}