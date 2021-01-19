// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

public class ReverseLinkedListRecursivelly {
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
        public ListNode reverseList(ListNode head) {
            return reverse(head, null);
        }

        //recursive method
        private ListNode reverse(ListNode head, ListNode newHead){
            if(head == null) return newHead;

            ListNode next = head.next;//save next
            head.next = newHead;// reverse pointer
            //advance previous and head
            newHead = head;
            head = next;

            return reverse(head, newHead);
        }
    }

}
