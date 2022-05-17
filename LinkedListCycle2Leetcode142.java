//Time complexity: O(N)
//Space Complexity: O(1)
//Leetcode: Yes
public class LinkedListCycle2Leetcode142 {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {

            if (head == null || head.next == null) {
                return null;
            }

            ListNode fast    = head;
            ListNode slow    = head;
            boolean  noCycle = true;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    noCycle = false;
                    break;
                }
            }
            //no cycle found either slow was null or the loop ended without break stmt
            if (noCycle) {
                return null;
            }
            //now traverse from the head and from the place where cycle was found..
            //where they interact is the place where they meet.
            ListNode temp = head;
            while(temp != slow) {
                slow = slow.next;
                temp = temp.next;
            }
            return temp;
        }
    }
}
