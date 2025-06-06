// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Forgot updating curr.next to null and ended up forming a cycle
// Approach: Create a recursive function that taes head f linked list as paramter. Recurse on the next nde until head is the last node (make it head of reversed linked list)
// Each recursive call would be returning the tail of the reversed linked list. After a recursive call, attach current node to tail and return the new tail(current node)

class Solution {
    ListNode global;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return global;
    }
    private ListNode helper(ListNode curr){
        if(curr==null||curr.next ==null){
            global = curr;
            return curr;
        }
        //ListNode tail = helper(curr.next);
        //tail.next = curr;
        helper(curr.next).next = curr;
        curr.next = null;
        return curr;
    }
}
