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

 // Time Complexity :O(m) for both recursive and iterative solution
 // Space Complexity : O(1) for iterative and for recursive memory for stack
//                  which will be O(m) when we reach the tail of the linked list
 // Did this code successfully run on Leetcode : yes
 // Any problem you faced while coding this : no


 // Your code here along with comments explaining your app
class Solution {

    //Iterative solution
    public ListNode reverseList(ListNode head) {
        //Iterative solution
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }


    //recursive solution
    public ListNode reverseList(ListNode head) {

        return reverse(head, null);

    }

    private ListNode reverse(ListNode curr, ListNode prev){
        //base
        if(curr == null)
            return prev;

        //logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        return reverse(curr,prev);
    }
}
