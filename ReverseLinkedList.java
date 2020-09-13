
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode node=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return node;
    }
}
