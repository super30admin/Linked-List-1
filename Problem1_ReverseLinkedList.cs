// Approach: traverse through each element and reverse the links
// Time Complexity: O(n) where n is the number of nodes
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
   
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next  = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
}