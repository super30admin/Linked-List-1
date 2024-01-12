// Time Complexity :o(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yess
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: I used recursion here to reverses my list
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead= reverseList(head.next);
        ListNode front= head.next;
        front.next= head;
        head.next=null;
        return newHead;
    }
}