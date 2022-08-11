// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
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
    int cnt =0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        cnt =n;
        if(head.next == null && n ==1) return null;
        return helper(head,null);
    }
    
    public ListNode helper(ListNode curr,ListNode prev){
        if(curr == null) return curr; 
        ListNode temp = helper(curr.next,curr);
        cnt--;
        if(prev == null && cnt ==0){
            return temp;
        }
        if(cnt == 0){
            prev.next = temp;
        }
        return curr;
    }
}
