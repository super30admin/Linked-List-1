// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


public class reverselist {
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
        public ListNode reverseList(ListNode head) {
            return reverseListR(head);
        }

        public ListNode reverseListR(ListNode node){
            if(node == null || node.next == null){
                return node;
            }

            ListNode  phead =  reverseListR(node.next);
            node.next.next = node;
            node.next = null;
            return phead;
        }
    }
