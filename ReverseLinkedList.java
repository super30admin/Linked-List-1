// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
        
        return helper(head,null);
    }
    
    public ListNode helper(ListNode head, ListNode prev) {
        if(head==null)
            return prev;
        
        ListNode next = head.next;
        head.next = prev;
        return helper(next,head);
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null, tmp = head;
        while(tmp!=null){
            ListNode tmpNode = new ListNode(tmp.val);
            tmpNode.next=prev;
            prev = tmpNode;
            tmp=tmp.next;
        }
        return prev;
    }
}