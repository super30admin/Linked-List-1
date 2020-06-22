/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;
       
        while(curr != null ){
            temp = curr.next;
         
            curr.next = prev;
           
            prev = curr;
            curr = temp;
           
        }
        return prev;
    }
}
/*
Time Complexity  : O(n)
Space Complexity : O(1)
*/