// Time Complexity : O(n) where n is the number of nodes in given LL
// Space Complexity : O(n) for using recursive stack
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Method 2 - Recursive
public class ReverseLinkedList {
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

            //base case
            if(head == null || head.next == null)
                return head;


            //logic
            ListNode reverse = reverseList(head.next); //st.pop()

            head.next.next = head;
            head.next = null;

            return reverse;
    }
}
/* Method 1  Iterative using pointers
TC: O(n) and SC: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {

        //null check
        if(head == null || head.next == null)
            return null;

        ListNode prev= null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        curr.next = prev;
        return curr;
    }
}
*/
