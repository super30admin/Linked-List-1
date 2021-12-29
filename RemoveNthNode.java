// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first = dummy;
        ListNode second = dummy;
        int count = 0;
        while(first.next!= null) {
            count++;
            if(count > n) {
                second = second.next;
            }
            first = first.next;
        }
        
        second.next = second.next.next;
        
        return dummy.next;
    }
}