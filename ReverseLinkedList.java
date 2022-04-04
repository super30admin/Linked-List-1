// ITERATIVE APPROACH
// Time Complexity : O(n) - Iterating till the end of the linked list
// Space Complexity : O(1) - constant time just storing the node references
// Did this code successfully run on Leetcode : Yes; (https://leetcode.com/submissions/detail/649374231/)
// Any problem you faced while coding this : No
// My Notes : Iterate till the end node, keep assigning the curr next to the prev, prev to the curr and thereby curr to the next

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

// RECURSIVE APPROACH
// Time Complexity : O(n) - Iterating till the end of the linked list
// Space Complexity : O(n) - Stack size
// Did this code successfully run on Leetcode : Yes; (https://leetcode.com/submissions/detail/672934484/)
// Any problem you faced while coding this : No
// My Notes : recurse till the end and when reached end, create new ListNode and move to the next
class Solution {
    ListNode revHead = null;
    public ListNode reverseList(ListNode head) {
        revHead = new ListNode(0);
        ListNode temp = revHead;
        recurseList(head);
        return temp.next;
    }
    
    private void recurseList(ListNode head){
        if(head!=null){
            recurseList(head.next);
            revHead.next = new ListNode(head.val);
           // System.out.println(" Val : "+head.val);
            revHead = revHead.next;
        }
        
    }
}