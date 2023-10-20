// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to return dummy.next and not head


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast=fast.next;
        }
        ListNode temp = slow.next;
        System.out.println("temp next "+temp.next);
        slow.next = temp.next;
        temp.next = null;
        return dummy.next;
    }
}