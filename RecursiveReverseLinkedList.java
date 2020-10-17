//Recursive solution

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
        
      return reverse(head,null);
    
}
    
    public ListNode reverse(ListNode curr,ListNode prev)
    {
        if(curr ==null)
            return prev;
        
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next,curr);
    }
}
