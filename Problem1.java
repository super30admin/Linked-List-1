// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
//Using a three pointer approach prev, curr and fast
//Initially prev would be null, will change curr.next to prev and go to each node of list

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
class Problem1 {
    public ListNode reverseList(ListNode head) {

        //if there is only one node
        if(head==null || head.next==null) return head;

        //three pointers
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;

        }
        //to handle the last node
        curr.next = prev;

        return curr;
    }
}