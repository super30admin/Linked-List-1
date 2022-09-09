// Time Complexity : O(n) where n is the number of nodes in given LL
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class LinkedListCycle2 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public ListNode detectCycle(ListNode head) {

            //null check
            if(head == null)
                return null;

            boolean flag = false;

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.println("no cycle found");
                return null;
            }
            slow = head;

            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }
}
