// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to refer class discussion


// Your code here along with comments explaining your approach

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        /* Brute force approach to traverse through the list and while 
        traversing check at every node whether the node is the nth node from last */
    //     ListNode prev = head;
    //     ListNode curr = head;
    //     if(head.next == null && n == 1){
    //         return head.next;
    //     }
    //     while(curr != null){
    //         if(fromLast(curr,n)){
    //             if(curr == head){
    //                 return head.next;
    //             }
    //             prev.next = curr.next;
    //             return head;
    //         }
    //         prev = curr;
    //         curr = curr.next;
    //     }
    //     return head;
    // }

    // private boolean fromLast(ListNode node, int n){
    //     int count = 1;
    //     while(count < n){
    //         node = node.next;
    //         count++;
    //     }
    //     if(node.next==null) return true;
    //     return false;

    /* 
     * Use slow and fast pointer and create a window between 
     * fast and slow and then move fast and slow by one till the fast reaches null
     * then just omit the slow.next element 
     * 
     */

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;


    }
}