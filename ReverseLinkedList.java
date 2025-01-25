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
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public ListNode reverseList(ListNode head) {

       ListNode prev = null;
      ListNode travel = head;
      while (travel!= null){
       ListNode temp = travel.next;
        travel.next = prev;
        prev = travel;
        travel = temp;
      } 
        return prev;
    }
}