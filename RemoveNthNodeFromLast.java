// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class RemoveNthNodeFromLast {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int count = 0;
            ListNode slow = head, fast = head;

            if(head == null || head.next == null)
                return null;

            while(count <= n){
                fast = fast.next;
                if(fast == null && count < n){
                    return head.next;
                }
                count++;
            }

            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }

            if(count == 1) return head.next;

            ListNode temp = slow.next;
            slow.next = temp.next;
            temp = null;

            return head;
        }
    }
}
