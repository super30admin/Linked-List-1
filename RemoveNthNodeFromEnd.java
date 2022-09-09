// Time Complexity : O(n) where n is the number of nodes in given LL
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//ONE PASS SOLUTION
public class RemoveNthNodeFromEnd {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode removeNthFromEnd(ListNode head, int n) {

            //null check
            if(head == null)
                return null;

            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode slow = dummy;
            ListNode fast = dummy;

            int count = 0;

            while(count <= n){
                fast = fast.next;
                count++;
            }

            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            return dummy.next;
        }
}
