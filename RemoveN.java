// Time Complexity : O(2n) => O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode dummy = new ListNode(-1);
     dummy.next = head;
     int length  = 0;
     ListNode temp = head;
     while (temp != null) {
         temp = temp.next;
         length++;
     }
     length -= n;
     temp = dummy;
     while (length > 0) {
         temp = temp.next;
         length--;
     }
     temp.next = temp.next.next;
     return dummy.next;
 }
     
 }
 