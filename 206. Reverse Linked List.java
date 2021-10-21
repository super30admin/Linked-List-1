// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//take prev as null initilly. store next of the current in temp to access it next time. connect current to previous. store current as previous and 
//do it till we find curr as null

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
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode cur=head;
          ListNode next=null; //temp
         while(cur!=null){
             next=cur.next;
             cur.next=prev;
             prev=cur;
             cur=next;
         }
        return prev;
        
    }
}