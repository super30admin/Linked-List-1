// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : No , Tried using the Iterative approach


// Your code here along with comments explaining your approach
// Used the iterative code to understand the concept of linked list.


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
        
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        if(curr.next!=null) System.out.println(curr.next.val);
        ListNode nextTemp = curr.next;
        
        if(curr.next!=null) System.out.println("Assing" +" to prev");
        curr.next = prev;
        
        prev = curr;
        if(prev!=null) System.out.println("prev "+ prev.val);
        
        curr = nextTemp;
        
        if(curr!=null) System.out.println("curr "+ curr.val);
    }
    return prev;
        
    }
}
