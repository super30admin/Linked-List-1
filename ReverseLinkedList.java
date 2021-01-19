// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     **/
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode reverseList(ListNode head){

            ListNode previous = null;//variable to keep track of previous value and init with null

            while(head != null){
                ListNode nextNode = head.next; //save next
                head.next = previous; //reverse pointer
                previous = head; //advance previous
                head = nextNode; // advance head
            }
            return previous;// new head at end
        }
    }

}
