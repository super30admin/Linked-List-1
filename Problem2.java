
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode temp = new ListNode(0);
        if(head!=null){
      
            temp.next = head;
       
            ListNode first = temp;
            ListNode second = temp;
       
            while(n>=0){
                first = first.next;
                n--;
            }
       
            while(first!=null){
                first = first.next;
                second = second.next;
            }
       
            second.next = second.next.next;
       
       
        }
        return temp.next;
        
    }
} 