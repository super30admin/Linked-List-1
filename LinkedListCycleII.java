// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
public class LinkedListCycleII {
    /**
     * Definition for singly-linked list.
     **/
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {

        public ListNode intersect(ListNode head){
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                //advance slow by 1 and fast by 2
                slow = slow.next;
                fast = fast.next.next;

                //if cycle then slow == fast at some point in cycle
                if(slow == fast){
                    return slow;
                }
            }
            return null; // return null if there is no cycle
        }

        public ListNode detectCycle(ListNode head) {
            ListNode start = head;
            // base case
            if(head == null || head.next == null) return null;

            //find intersect node and if none return null
            ListNode intersect = intersect(head);
            if(intersect == null) return null;

            //loop until start and intersect are equal, which is where they intersect and return either back
            while(intersect != start){
                start = start.next;
                intersect = intersect.next;
            }
            return start;
        }
    }

}
