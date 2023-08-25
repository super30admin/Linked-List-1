// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


//Method 1: using three pointers prev,curr,next/fast

class Solution {
    public  ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode fast = head;
        ListNode next = fast.next;

        while(next != null){
            cur.next = prev;
            prev = cur;
            cur = next;
            fast = fast.next;
        }
        //for last node case 
        fast.next = prev;

        return fast;
    }
}
