// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
public class RemoveNthNodeFromEndOfList {

    /**
     * Definition for singly-linked list.
     * */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            //create temp node and set it's pointer to current head
            ListNode temp = new ListNode(-1);
            temp.next = head;

            //fast and slow pointer to traverse listnode
            ListNode slow = temp;
            ListNode fast = temp;

            //advance fast pointer by n distance from slow pointer
            for (int i = 1; i <= n+1 ; i++) {
                fast = fast.next;
            }

            //advance both slow and fast until fast reaches end
            while(fast != null){
                fast = fast.next;
                slow = slow.next;
            }

            //set slow pointer to next next pointer
            slow = slow.next.next;

            //return head
            return temp.next;
        }
    }

}
